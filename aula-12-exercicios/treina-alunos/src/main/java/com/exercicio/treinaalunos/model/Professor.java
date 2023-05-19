package com.exercicio.treinaalunos.model;


import java.util.List;

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
@Entity(name = "professores")
public class Professor {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idProfessor;
  
  private double valorHora;

  @OneToMany
  private List<Turma> turmas;

  @Embedded
  private Usuario usuario;
}
