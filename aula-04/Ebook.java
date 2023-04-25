public class Ebook extends Livro {
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
  boolean applyDiscount(double porcentagem) {
    if (porcentagem > 0.15) return false;

    double discount = this.getBookPrice() * porcentagem;
    double newValue = this.getBookPrice() - discount;
    this.setBookPrice(newValue);
    return true;

    // poderia utilizar da seguinte forma:
    // return super.applyDiscount(porcentagem)
  }
}
