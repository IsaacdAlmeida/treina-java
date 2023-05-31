package com.medical.cuidareciferestapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.medical.cuidareciferestapi.helpers.Especialidade;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
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
@Entity(name = "medicos")
public class Medico {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idMedico;

  @Column(nullable = false)
  private String nome;

  @JsonFormat(pattern = "^(.+)@(.+)$")
  @Column(nullable = false, unique = true)
  private String email;

  @JsonFormat(pattern = "\\d{2}-\\d{4,5}-\\d{4}")
  @Column(nullable = false)
  private String telefone;

  @Column(nullable = false, unique = true)
  private String crm;

  @Column(nullable = false)
  private Especialidade especialidade;

  @Column
  private Boolean isActive = true;

  @Embedded 
  private Endereco endereco;
}
