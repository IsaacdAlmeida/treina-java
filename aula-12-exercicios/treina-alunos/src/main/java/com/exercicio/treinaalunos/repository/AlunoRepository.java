package com.exercicio.treinaalunos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicio.treinaalunos.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
  
}
