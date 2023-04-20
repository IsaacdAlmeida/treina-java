import java.util.Scanner;

public class Exercicio1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("digite o valor do número: ");
    double userInput = sc.nextDouble();

    sc.close();

    double num = userInput;
    double den = 1;
    double soma = 0;

    while (num >= 1) {
      soma += num / den;

      num -= 1;
      den += 1;
    }

    System.out.println(soma);
  }
}
