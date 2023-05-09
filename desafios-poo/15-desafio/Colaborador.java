import java.util.Date;

public class Colaborador extends Fisica {
  private String ctps;
  private String pis;
  private String tituloEleitor;
  private Boolean reservista;
  private String estadoCivil;
  private int numDependentes;
  private Boolean ativo;
  private String setor;
  private String cargo;
  private Double salario;
  private String telefone1;
  private String telefone2;
  private String emailPessoal;
  private String emailCorporativo;
  private Usuario usuario;

  public Colaborador() {
  }

  public Colaborador(int id, String name, String logradouro, int numero, String complemento, String bairro, String cep,
      String cidade, String uf, String cpf, String rg, String genero, Date anoNascimento, String ctps, String pis,
      String tituloEleitor, Boolean reservista, String estadoCivil, int numDependentes, Boolean ativo, String setor,
      String cargo, Double salario, String telefone1, String telefone2, String emailPessoal, String emailCorporativo) {
    super(id, name, logradouro, numero, complemento, bairro, cep, cidade, uf, cpf, rg, genero, anoNascimento);
    this.ctps = ctps;
    this.pis = pis;
    this.tituloEleitor = tituloEleitor;
    this.reservista = reservista;
    this.estadoCivil = estadoCivil;
    this.numDependentes = numDependentes;
    this.ativo = ativo;
    this.setor = setor;
    this.cargo = cargo;
    this.salario = salario;
    this.telefone1 = telefone1;
    this.telefone2 = telefone2;
    this.emailPessoal = emailPessoal;
    this.emailCorporativo = emailCorporativo;
  }

  public Colaborador(int id, String name, String logradouro, int numero, String complemento, String bairro, String cep,
      String cidade, String uf, String cpf, String rg, String genero, Date anoNascimento, String ctps, String pis,
      String tituloEleitor, Boolean reservista, String estadoCivil, int numDependentes, Boolean ativo, String setor,
      String cargo, Double salario, String telefone1, String telefone2, String emailPessoal, String emailCorporativo,
      Usuario usuario) {
    super(id, name, logradouro, numero, complemento, bairro, cep, cidade, uf, cpf, rg, genero, anoNascimento);
    this.ctps = ctps;
    this.pis = pis;
    this.tituloEleitor = tituloEleitor;
    this.reservista = reservista;
    this.estadoCivil = estadoCivil;
    this.numDependentes = numDependentes;
    this.ativo = ativo;
    this.setor = setor;
    this.cargo = cargo;
    this.salario = salario;
    this.telefone1 = telefone1;
    this.telefone2 = telefone2;
    this.emailPessoal = emailPessoal;
    this.emailCorporativo = emailCorporativo;
    this.usuario = usuario;
  }

  public String getCtps() {
    return ctps;
  }

  public void setCtps(String ctps) {
    this.ctps = ctps;
  }

  public String getPis() {
    return pis;
  }

  public void setPis(String pis) {
    this.pis = pis;
  }

  public String getTituloEleitor() {
    return tituloEleitor;
  }

  public void setTituloEleitor(String tituloEleitor) {
    this.tituloEleitor = tituloEleitor;
  }

  public Boolean getReservista() {
    return reservista;
  }

  public void setReservista(Boolean reservista) {
    this.reservista = reservista;
  }

  public String getEstadoCivil() {
    return estadoCivil;
  }

  public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  public int getNumDependentes() {
    return numDependentes;
  }

  public void setNumDependentes(int numDependentes) {
    this.numDependentes = numDependentes;
  }

  public Boolean getAtivo() {
    return ativo;
  }

  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  public String getSetor() {
    return setor;
  }

  public void setSetor(String setor) {
    this.setor = setor;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public Double getSalario() {
    return salario;
  }

  public void setSalario(Double salario) {
    this.salario = salario;
  }

  public String getTelefone1() {
    return telefone1;
  }

  public void setTelefone1(String telefone1) {
    this.telefone1 = telefone1;
  }

  public String getTelefone2() {
    return telefone2;
  }

  public void setTelefone2(String telefone2) {
    this.telefone2 = telefone2;
  }

  public String getEmailPessoal() {
    return emailPessoal;
  }

  public void setEmailPessoal(String emailPessoal) {
    this.emailPessoal = emailPessoal;
  }

  public String getEmailCorporativo() {
    return emailCorporativo;
  }

  public void setEmailCorporativo(String emailCorporativo) {
    this.emailCorporativo = emailCorporativo;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }
}
