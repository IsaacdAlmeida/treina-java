package entidades;
import abstratas.Livro;

public class CarrinhoDeCompras {
  private double total;

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public void adicionaAoCarrinho(Livro livro) {
    System.out.println("Adicionado:" + livro);
    this.total += livro.getBookPrice();
  }

  // public void adicionaAoCarrinho(Ebook ebook) {
  // System.out.println("Adicionado:" + ebook);
  // this.total += ebook.getBookPrice();
  // }

  // public void adicionaAoCarrinho(LivroFisico livro) {
  // System.out.println("Adicionado:" + livro);
  // this.total += livro.getBookPrice();
  // }

}
