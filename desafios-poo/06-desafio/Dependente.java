import java.util.Date;

public class Dependente {
  private int sequencial;
  private String nomeCompleto;
  private Date dataNascimento;
  private int sexo;
  private Boolean participaPlano;
  private Funcionario funcionario;

  public int getSequencial() {
    return sequencial;
  }

  public void setSequencial(int sequencial) {
    this.sequencial = sequencial;
  }

  public String getNomeCompleto() {
    return nomeCompleto;
  }

  public void setNomeCompleto(String nomeCompleto) {
    this.nomeCompleto = nomeCompleto;
  }

  public Date getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public int getSexo() {
    return sexo;
  }

  public void setSexo(int sexo) {
    this.sexo = sexo;
  }

  public Boolean getParticipaPlano() {
    return participaPlano;
  }

  public void setParticipaPlano(Boolean participaPlano) {
    this.participaPlano = participaPlano;
  }

  public Funcionario getFuncionario() {
    return funcionario;
  }

  public void setFuncionario(Funcionario funcionario) {
    this.funcionario = funcionario;
  }

}
