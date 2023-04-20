public class CalculadoraDeEstoque {
  public static void main(String[] args) {
    double livroJava = 59.90;
    double livroPython = 559.90;

    double soma = livroJava + livroPython;

    if (soma < 150) {
      System.out.println("Seu estoque está baixo");
    } else if (soma > 150 && soma <= 2000) {
      System.out.println("Seu estoque está alto");
    } else {
      System.out.println("Seu estoque está muito alto");
    }
  }
}
