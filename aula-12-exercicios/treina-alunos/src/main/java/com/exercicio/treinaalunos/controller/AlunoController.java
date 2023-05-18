package com.exercicio.treinaalunos.controller;

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

import com.exercicio.treinaalunos.model.Aluno;
import com.exercicio.treinaalunos.repository.AlunoRepository;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

  @PostMapping
  public ResponseEntity<Aluno> cadastrarAluno(@RequestBody Aluno aluno) {
    return ResponseEntity.status(HttpStatus.CREATED).body(alunoRepository.save(aluno));
  }

  @GetMapping
  public ResponseEntity<List<Aluno>> listarAlunos() {
    return ResponseEntity.status(HttpStatus.OK).body(alunoRepository.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Optional<Aluno>> listarAlunoPorId(@PathVariable("id") long id) {
    return ResponseEntity.status(HttpStatus.OK).body(alunoRepository.findById(id));
  }

  @PutMapping
  public ResponseEntity<Aluno> atualizarAluno(@RequestBody Aluno aluno) {
    return ResponseEntity.status(HttpStatus.OK).body(alunoRepository.save(aluno));
  }

  @DeleteMapping("/{id}")
  public void deletarAluno(@PathVariable("id") long id) {
    alunoRepository.deleteById(id);
  }
  
  @Autowired
  private AlunoRepository alunoRepository;
}
