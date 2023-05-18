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

import com.exercicio.treinaalunos.model.Turma;
import com.exercicio.treinaalunos.repository.TurmaRepository;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

  @PostMapping
  public ResponseEntity<Turma> cadastrarTurma(@RequestBody Turma turma) {
    return ResponseEntity.status(HttpStatus.CREATED).body(turmaRepository.save(turma));
  }

  @GetMapping
  public ResponseEntity<List<Turma>> listarTurmas() {
    return ResponseEntity.status(HttpStatus.OK).body(turmaRepository.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Optional<Turma>> listarTurmaPorId(@PathVariable("id") long id) {
    return ResponseEntity.status(HttpStatus.OK).body(turmaRepository.findById(id));
  }

  @PutMapping
  public ResponseEntity<Turma> atualizarTurma(@RequestBody Turma turma) {
    return ResponseEntity.status(HttpStatus.OK).body(turmaRepository.save(turma));
  }

  @DeleteMapping("/{id}")
  public void deletarTurma(@PathVariable("id") long id) {
    turmaRepository.deleteById(id);
  }
  

  @Autowired
  private TurmaRepository turmaRepository;
}
