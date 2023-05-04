package entidades;
import interfaces.Produto;
import interfaces.Promocional;

public class Revista implements Produto, Promocional {
  private String nome;
  private String descricaco;
  private double preco;
  private Editora editora;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricaco() {
    return descricaco;
  }

  public void setDescricaco(String descricaco) {
    this.descricaco = descricaco;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public Editora getEditora() {
    return editora;
  }

  public void setEditora(Editora editora) {
    this.editora = editora;
  }

  @Override
  public String gerarCodigoBarras() {
    return this.getNome() + " " + this.getPreco() + "REVISTA";
  }

  @Override
  public boolean applyDiscount(double porcentagem) {
    if (porcentagem > 0.3) return false;

    double discount = this.getPreco() * porcentagem;
    double newValue = this.getPreco() - discount;
    this.setPreco(newValue);
    return true;
  }
}
