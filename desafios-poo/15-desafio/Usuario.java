public class Usuario {
  private String login;
  private String senha;
  private String permissao;
  private Colaborador colaborador;

  public Usuario() {

  }

  public Usuario(String login, String senha, String permissao, Colaborador colaborador) {
    this.login = login;
    this.senha = senha;
    this.permissao = permissao;
    this.colaborador = colaborador;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public String getPermissao() {
    return permissao;
  }

  public void setPermissao(String permissao) {
    this.permissao = permissao;
  }

  public Colaborador getColaborador() {
    return colaborador;
  }

  public void setColaborador(Colaborador colaborador) {
    this.colaborador = colaborador;
  }

  public void editarPerfil() {
    System.out.println("classe Usuário - método editar Perfil");
  }

  public void alterarSenha() {
    System.out.println("classe Usuário - método alterarSenha");
  }


  public void criarUsuario() {
    System.out.println("classe Usuário - método criarUsuario");
  }

  public void apagarUsuario() {
    System.out.println("classe Usuário - método apagar usuario");
  }



}
