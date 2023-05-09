package entidades;

import java.util.List;

import abstratas.Livro;
import interfaces.Produto;

public class CarrinhoDeCompras {
  private double total;
  private List<Produto> produtos;

  public List<Produto> getProdutos() {
    return produtos;
  }

  public void setProdutos(List<Produto> produtos) {
    this.produtos = produtos;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public void adicionaAoCarrinho(Livro livro) {
    System.out.println("Adicionado:" + livro);
    this.total += livro.getBookPrice();
    
    produtos.add(livro);
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
