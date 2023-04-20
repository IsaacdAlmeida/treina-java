public class CalculadoraEstoque {
  public static void main(String[] args) {
    Livro livroJavascript = new Livro();

    livroJavascript.bookName = "Livro JavaScript";
    livroJavascript.bookDescription = "JavaScript melhor linguagem";
    livroJavascript.bookIsbn = "4646511215";
    livroJavascript.bookPrice = 59.80;
    
    Autor autorLivroJavaScript = new Autor();
    
    autorLivroJavaScript.authorName = "isaac";
    autorLivroJavaScript.authorEmail = "isaac@gmail.com";
    autorLivroJavaScript.authorCpf = "121541561";

    livroJavascript.author = autorLivroJavaScript;
    
    // livroJavascript.showBookDetails(); // agora posso chamar o método showBookDetails para imprimir no console
    
    double newBookPrice = livroJavascript.applyDiscount(0.1);
    
    System.out.println(newBookPrice);

    Livro livroCSS = new Livro();

    livroCSS.bookName = "Livro CSS";
    livroCSS.bookDescription = "estilize com estilo";
    livroCSS.bookIsbn = "456451186815312";
    livroCSS.bookPrice = 69.80;

    Autor autorLivroCSS = new Autor();

    autorLivroCSS.authorName = "John";
    autorLivroCSS.authorEmail = "john@gmail.com";
    autorLivroCSS.authorCpf = "0182213219019";

    livroCSS.author = autorLivroCSS;
    
    // livroCSS.showBookDetails();

  }
}
