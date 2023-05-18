package com.livraria.treina.livrariatreina.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livraria.treina.livrariatreina.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {
  
  Optional<List<Autor>> findByNome(String nome);

  Optional<Autor> findByEmail(String email);

  Optional<List<Autor>> findByNomeLike(String nome);
  
}
