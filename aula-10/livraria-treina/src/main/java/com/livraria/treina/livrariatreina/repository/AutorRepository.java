package com.livraria.treina.livrariatreina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livraria.treina.livrariatreina.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {
  
}
