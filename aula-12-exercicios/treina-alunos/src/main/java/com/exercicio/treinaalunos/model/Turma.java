package com.exercicio.treinaalunos.model;

import java.time.LocalDate;

import com.exercicio.treinaalunos.helpers.Turno;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
  private Turno turno;

  @Column(nullable = false)
  private Integer numeroVagas;

  @Column(nullable = false)
  private Double preco;

  @Column(nullable = false)
  private Integer cargaHoraria;

  @Column(nullable = false)
  @JsonFormat(pattern = "dd/MM/yyyy")
  private LocalDate dataInicio;
}