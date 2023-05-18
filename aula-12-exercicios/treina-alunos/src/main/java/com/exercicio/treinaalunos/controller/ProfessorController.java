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

import com.exercicio.treinaalunos.model.Professor;
import com.exercicio.treinaalunos.repository.ProfessorRepository;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

  @PostMapping
  public ResponseEntity<Professor> cadastrarProfessor(@RequestBody Professor professor) {
    return ResponseEntity.status(HttpStatus.CREATED).body(professorRepository.save(professor));
  }

  @GetMapping
  public ResponseEntity<List<Professor>> listarProfessores() {
    return ResponseEntity.status(HttpStatus.OK).body(professorRepository.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Optional<Professor>> listarProfessorPorId(@PathVariable("id") long id) {
    return ResponseEntity.status(HttpStatus.OK).body(professorRepository.findById(id));
  }

  @PutMapping
  public ResponseEntity<Professor> atualizarProfessor(@RequestBody Professor professor) {
    return ResponseEntity.status(HttpStatus.OK).body(professorRepository.save(professor));
  }

  @DeleteMapping("/{id}")
  public void deletarProfessor(@PathVariable("id") long id) {
    professorRepository.deleteById(id);
  }
  
  @Autowired
  private ProfessorRepository professorRepository;
}
