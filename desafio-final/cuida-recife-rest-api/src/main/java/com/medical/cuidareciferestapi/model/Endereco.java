package com.medical.cuidareciferestapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Endereco {
  @Column(nullable = false)
  private String logradouro;

  private Integer numero;

  private String complemento;

  @Column(nullable = false)
  private String bairro;

  @Column(nullable = false)
  private String cidade;

  @Column(nullable = false)
  private String uf;

  @Column(nullable = false)
  private String cep;

}
