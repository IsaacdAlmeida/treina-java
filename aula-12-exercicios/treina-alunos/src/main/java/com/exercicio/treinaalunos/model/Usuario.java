package com.exercicio.treinaalunos.model;

import jakarta.persistence.Column;  
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Usuario {
  @Column(nullable = false)
  private String nome;

  @Column(unique = true, nullable = false)
  private String cpf;

  
  @Column(unique = true, nullable = false)
  private String email;
  
}
