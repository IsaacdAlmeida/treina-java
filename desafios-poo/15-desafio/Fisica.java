import java.util.Date;

public abstract class Fisica extends Pessoa {
  private String cpf;
  private String rg;
  private String genero;
  private Date anoNascimento;

  public Fisica() {

  }

  public Fisica(int id, String name, String logradouro, int numero, String complemento, String bairro, String cep,
      String cidade, String uf, String cpf, String rg, String genero, Date anoNascimento) {
    super(id, name, logradouro, numero, complemento, bairro, cep, cidade, uf);
    this.cpf = cpf;
    this.rg = rg;
    this.genero = genero;
    this.anoNascimento = anoNascimento;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getRg() {
    return rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public Date getAnoNascimento() {
    return anoNascimento;
  }

  public void setAnoNascimento(Date anoNascimento) {
    this.anoNascimento = anoNascimento;
  }

}
