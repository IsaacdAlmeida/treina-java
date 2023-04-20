import java.util.Scanner;

public class ExemploScanner {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o preço do livro de Java: ");
    double livroJava = sc.nextDouble();

    System.out.println("Digite o preço do livro de Python: ");
    double livroPython = sc.nextDouble();

    sc.close();

    double soma = livroJava + livroPython;

    System.out.println(soma);
  }
}
