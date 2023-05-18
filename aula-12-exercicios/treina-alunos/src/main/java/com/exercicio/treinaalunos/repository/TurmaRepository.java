package com.exercicio.treinaalunos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicio.treinaalunos.model.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long> {
  
}
