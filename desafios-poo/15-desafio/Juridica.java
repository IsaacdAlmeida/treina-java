import java.util.Date;

public class Juridica extends Pessoa {
  private String cnpj;
  private String inscricacoEstadual;
  private String nomeFantasia;
  private Date fundacao;

  public Juridica() {

  }

  public Juridica(int id, String name, String logradouro, int numero, String complemento, String bairro, String cep,
      String cidade, String uf, String cnpj, String inscricacoEstadual, String nomeFantasia, Date fundacao) {
    super(id, name, logradouro, numero, complemento, bairro, cep, cidade, uf);
    this.cnpj = cnpj;
    this.inscricacoEstadual = inscricacoEstadual;
    this.nomeFantasia = nomeFantasia;
    this.fundacao = fundacao;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getInscricacoEstadual() {
    return inscricacoEstadual;
  }

  public void setInscricacoEstadual(String inscricacoEstadual) {
    this.inscricacoEstadual = inscricacoEstadual;
  }

  public String getNomeFantasia() {
    return nomeFantasia;
  }

  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  public Date getFundacao() {
    return fundacao;
  }

  public void setFundacao(Date fundacao) {
    this.fundacao = fundacao;
  }

}
