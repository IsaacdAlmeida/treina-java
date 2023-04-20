public class Livro {
  // atributos

  String bookName;
  String bookDescription;
  double bookPrice;
  String bookIsbn;
  Autor author; // composição de classe, nesse caso eu defino o atriubto de um tipo

  // método construtor

  Livro() {
    
  }

  Livro(String bookName, String bookDescription ) {
    this.bookName = bookName;
    this.bookDescription = bookDescription;
  }

  // métodos

  void showBookDetails() {
    System.out.println("Detalhes do Livro: " + bookName);
    System.out.println("Nome: " + bookName);
    System.out.println("Descrição: " + bookDescription);
    System.out.println("Preço: " + bookPrice);
    System.out.println("ISBN: " + bookIsbn);

    if (hasAuthor()) {
      author.showAuthorDetails();
    }
    System.out.println("---------------------");
  }
  

  double applyDiscount(double porcentagem) {
    this.bookPrice = this.bookPrice - (this.bookPrice * porcentagem);

    return this.bookPrice;
  }

  boolean hasAuthor() {
    return this.author != null;
  }
}