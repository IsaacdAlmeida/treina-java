package com.exercicio.treinaalunos.model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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

  @Column(nullable = false)
  private String nome;

  @Column(unique = true)
  private String cpf;

  @JsonFormat(pattern = "dd/MM/yyyy")
  private LocalDate dataNascimento;
  
  @Column(unique = true)
  private String email;

  private Boolean pcd;

  @ManyToMany(mappedBy = "alunos")
  private List<Turma> turmas;
}
