package com.exercicio.treinaalunos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicio.treinaalunos.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
  
}
