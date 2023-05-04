package entidades;
import abstratas.Livro;
import interfaces.Promocional;

public class Ebook extends Livro implements Promocional {
  private String marcaDagua;

  public String getMarcaDagua() {
    return marcaDagua;
  }

  public void setMarcaDagua(String marcaDagua) {
    this.marcaDagua = marcaDagua;
  }

  public Ebook() {
    super(); // opcional
  }

  public Ebook(Autor author) {
    super(author);
  }

  @Override
  public String gerarCodigoBarras() {
    return this.getBookName() + " " + this.getBookPrice() + "EBOOK";
  }

  @Override
  public boolean applyDiscount(double porcentagem) {
    if (porcentagem > 0.15) return false;

    double discount = this.getBookPrice() * porcentagem;
    double newValue = this.getBookPrice() - discount;
    this.setBookPrice(newValue);
    return true;

    // poderia utilizar da seguinte forma:
    // return super.applyDiscount(porcentagem)
  }
}
