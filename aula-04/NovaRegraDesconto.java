public class NovaRegraDesconto {
  public static void main(String[] args) {
    Autor livroEbook = new Autor();
    livroEbook.setAuthorName("Joaquim");

    Ebook ebook = new Ebook(livroEbook);

    ebook.setBookPrice(80);

    // System.out.println(ebook.getAuthor().getAuthorName());

    LivroFisico novoLivro = new LivroFisico();

    novoLivro.setBookPrice(100);

    // System.out.println(novoLivro.getTaxaImpressao());

    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

    carrinho.adicionaAoCarrinho(novoLivro);
    carrinho.adicionaAoCarrinho(ebook);

    System.out.println(carrinho.getTotal());

  }
}
