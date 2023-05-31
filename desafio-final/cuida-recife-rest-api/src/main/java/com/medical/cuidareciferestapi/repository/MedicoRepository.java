package com.medical.cuidareciferestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medical.cuidareciferestapi.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
  
}
