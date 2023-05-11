package com.livraria.treina.livrariatreina.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // gera todos os getters e setters
@AllArgsConstructor // constutor com todos os atributos
@NoArgsConstructor // construtor padrão vazio
@Entity(name = "livros") // define a classe como tabela
public class Livro {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idLivro;
  private String nome;
  private String descricao;
  private String isbn;
  private double preco;

}
