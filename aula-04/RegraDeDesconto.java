public class RegraDeDesconto {
  public static void main(String[] args) {
    Livro livro = new Livro();
    livro.setBookPrice(60);
    livro.setBookName("CursoRápido");
    livro.setBookIsbn("129i129i131312i");
    livro.setBookDescription("ótimo livro");

    Autor livroCursoRapido = new Autor();

    livroCursoRapido.setAuthorName("Isaac");
    livroCursoRapido.setAuthorEmail("isaac@gmail.com");
    livroCursoRapido.setAuthorCpf("191811929");

    livro.setAuthor(livroCursoRapido);

    livro.showBookDetails();

    System.out.println("valor atual do livro: " + livro.getBookPrice());

    if (livro.applyDiscount(0.3)) {
      System.out.println("valor atual do livro com desconto: " + livro.getBookPrice());
    } else
      System.out.println("Valor deve ser menor que 30%");
  }
}