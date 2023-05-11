package com.livraria.treina.livrariatreina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livraria.treina.livrariatreina.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
  
}
