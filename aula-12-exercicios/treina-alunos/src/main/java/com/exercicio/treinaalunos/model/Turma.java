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
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "turmas")
public class Turma {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idTurma;

  @Column(nullable = false)
  private String nome;

  @Column(nullable = false)
  private String turno;

  @Column(nullable = false)
  private Integer numeroVagas;

  @Column(nullable = false)
  private Double preco;

  @Column(nullable = false)
  private Integer cargaHoraria;

  @Column(nullable = false)
  @JsonFormat(pattern = "dd/MM/yyyy")
  private LocalDate dataInicio;

  @ManyToOne
  private Professor professor;
  
  @ManyToMany
  private List<Aluno> alunos;

}