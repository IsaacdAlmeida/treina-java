public class LivroFisico extends Livro {
  
  // constructor
  public LivroFisico() {

  }

  double getTaxaImpressao() {
    return this.getBookPrice() * 0.05;
  }
}
