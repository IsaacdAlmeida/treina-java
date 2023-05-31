package com.medical.cuidareciferestapi.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medical.cuidareciferestapi.dto.MedicoDTO;
import com.medical.cuidareciferestapi.model.Medico;
import com.medical.cuidareciferestapi.repository.MedicoRepository;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

  // criar médico
  @PostMapping
  public ResponseEntity<Medico> cadastrarMedico(@RequestBody Medico medico) {
    return ResponseEntity.status(HttpStatus.OK).body(medicoRepository.save(medico));
  }

  // mostrar médicos
  @GetMapping
  public ResponseEntity<Page<MedicoDTO>> mostrarMedicos(
      @PageableDefault(size = 10) Pageable paginacao) {
    Page<Medico> medicos = medicoRepository.findAll(paginacao);
    List<MedicoDTO> medicosDTO = medicos.stream().map(MedicoDTO::new).collect(Collectors.toList());
    Page<MedicoDTO> medicosDTOPage = new PageImpl<>(medicosDTO, paginacao, medicos.getTotalElements());
    return ResponseEntity.status(HttpStatus.OK).body(medicosDTOPage);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Medico> atualizarMedico(@PathVariable Long id, @RequestBody Medico medicoAtualizado) {
    Optional<Medico> optionalMedico = medicoRepository.findById(id);

    if (medicoAtualizado.getCrm() != null || medicoAtualizado.getEspecialidade() != null) {
      return ResponseEntity.badRequest().build();
    }

    if (optionalMedico.isPresent()) {
      Medico medico = optionalMedico.get();
      medico.setNome(medicoAtualizado.getNome());
      medico.setEmail(medicoAtualizado.getEmail());

      Medico updatedMedico = medicoRepository.save(medico);

      return ResponseEntity.status(HttpStatus.OK).body(updatedMedico);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @PutMapping("/{id}/deletar")
  public ResponseEntity<Void> desativarMedico(@PathVariable Long id) {
    Optional<Medico> optionalMedico = medicoRepository.findById(id);

    if (optionalMedico.isPresent()) {
      Medico medico = optionalMedico.get();
      medico.setIsActive(false);

      medicoRepository.save(medico);

      return ResponseEntity.ok().build();
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @Autowired
  private MedicoRepository medicoRepository;
}
