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

import com.livraria.treina.livrariatreina.model.Autor;
import com.livraria.treina.livrariatreina.repository.AutorRepository;

@RestController
@RequestMapping("/autores")
public class AutorController {

  @PostMapping
  public ResponseEntity<Autor> cadastrarAutor(@RequestBody Autor autor) {
    return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(autorRepository.save(autor));
  }

  @GetMapping
  public ResponseEntity<List<Autor>> listarAutores() {
    return ResponseEntity.status(HttpStatus.OK).body(autorRepository.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Optional<Autor>> listarAutorPorId(@PathVariable("id") long id) {
    return ResponseEntity.status(HttpStatus.OK).body(autorRepository.findById(id));
  }

  @PutMapping
  public ResponseEntity<Autor> atualizarAutor(@RequestBody Autor autor) {
    return ResponseEntity.status(HttpStatus.OK).body(autorRepository.save(autor));
  }

  @DeleteMapping("/{id}")
  public void deletarAutor(@PathVariable("id") long id) {
    autorRepository.deleteById(id);
  }

  @Autowired
  private AutorRepository autorRepository;
}
