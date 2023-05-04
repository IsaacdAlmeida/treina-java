package entidades;
import abstratas.Livro;
import interfaces.Promocional;

public class LivroFisico extends Livro implements Promocional {

  // constructor
  public LivroFisico() {

  }

  double getTaxaImpressao() {
    return this.getBookPrice() * 0.05;
  }

  @Override
  public boolean applyDiscount(double porcentagem) {
    if (porcentagem > 0.3) return false;

    double discount = this.getBookPrice() * porcentagem;
    double newValue = this.getBookPrice() - discount;
    this.setBookPrice(newValue);
    return true;
  }

  @Override
  public String gerarCodigoBarras() {
    return this.getBookName() + " " + this.getBookPrice() + "LF";
  }
}
