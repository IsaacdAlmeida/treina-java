package com.medical.cuidareciferestapi.dto;

import com.medical.cuidareciferestapi.helpers.Especialidade;
import com.medical.cuidareciferestapi.model.Medico;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicoDTO {
  private String nome;
  private String email;
  private String crm;
  private Especialidade especialidade;
  
  public MedicoDTO(Medico medico) {
    this.nome = medico.getNome();
    this.email = medico.getEmail();
    this.crm = medico.getCrm();
    this.especialidade = medico.getEspecialidade();    
  }
}
