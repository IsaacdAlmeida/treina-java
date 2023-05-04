public abstract class Livro implements Produto {
  // Modificador de acessos:
  // default
  // public
  // private -> dentro somente da classe
  // protected

  // atributos

  private String bookName;
  private String bookDescription;
  private double bookPrice;
  private String bookIsbn;
  private Autor author; // composição de classe, nesse caso eu defino o atriubto de um tipo

  // método construtor

  Livro() {
    
  }

  Livro(Autor author) {
    this.author = author;
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

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public String getBookDescription() {
    return bookDescription;
  }

  public void setBookDescription(String bookDescription) {
    this.bookDescription = bookDescription;
  }

  public double getBookPrice() {
    return bookPrice;
  }

  public void setBookPrice(double bookPrice) {
    this.bookPrice = bookPrice;
  }

  public String getBookIsbn() {
    return bookIsbn;
  }

  public void setBookIsbn(String bookIsbn) {
    this.bookIsbn = bookIsbn;
  }

  public Autor getAuthor() {
    return author;
  }

  public void setAuthor(Autor author) {
    this.author = author;
  }

  // abstract boolean applyDiscount(double porcentagem);

  boolean hasAuthor() {
    return this.author != null;
  }
}