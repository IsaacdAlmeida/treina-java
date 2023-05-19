package com.exercicio.treinaalunos.model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "alunos")
public class Aluno {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idAluno;

  @JsonFormat(pattern = "dd/MM/yyyy")
  private LocalDate dataNascimento;
  
  private boolean pcd;

  @OneToMany
  private List<Turma> turmas;

  @Embedded
  private Usuario usuario;
}
