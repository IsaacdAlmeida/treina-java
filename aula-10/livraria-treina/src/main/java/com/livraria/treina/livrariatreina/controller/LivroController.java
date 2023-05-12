package com.livraria.treina.livrariatreina.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.livraria.treina.livrariatreina.model.Livro;
import com.livraria.treina.livrariatreina.repository.LivroRepository;

@RestController
@RequestMapping("/livros")
public class LivroController {

  @PostMapping
  public ResponseEntity<Livro> cadastrarLivro(@RequestBody Livro livro) {
    return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(livroRepository.save(livro));
  }

  @GetMapping
  public ResponseEntity<List<Livro>> listarLivros() {
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(livroRepository.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Optional<Livro>> listarLivrosPorId(@PathVariable("id") long id) {
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(livroRepository.findById(id));
  }

  @PutMapping("/{id}")
  public ResponseEntity<Livro> atualizarLivro(@PathVariable("id") long id, @RequestBody Livro livroAtualizado) {

    Optional<Livro> livroEncontrado = livroRepository.findById(id);

    if (livroEncontrado.isPresent()) {
      Livro livro = livroEncontrado.get();
      livro.setNome(livroAtualizado.getNome());
      livro.setDescricao(livroAtualizado.getDescricao());
      livro.setIsbn(livroAtualizado.getIsbn());
      livro.setPreco(livroAtualizado.getPreco());

      Livro updatedLivro = livroRepository.save(livro);

      return ResponseEntity
        .status(HttpStatus.OK)
        .body(updatedLivro);
    } else {
      return ResponseEntity
        .status(HttpStatus.NOT_FOUND)
        .build();
    }
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deletarLivro(@PathVariable("id") long id) {
    Optional<Livro> livroEncontrado = livroRepository.findById(id);

    if(livroEncontrado.isPresent()) {
      livroRepository.deleteById(id);
      return ResponseEntity
        .status(HttpStatus.NO_CONTENT)
        .build();
    } else {
      return ResponseEntity
        .status(HttpStatus.NOT_FOUND)
        .build();
    }
  }

  @Autowired
  private LivroRepository livroRepository;
}


