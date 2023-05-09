import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcecao {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite sua idade'");
    int idade = sc.nextInt();

    try {
      System.out.println("Sua idade é " + idade);
    } catch (InputMismatchException exception) {
      System.out.println("erro no código");
    }

    sc.close();

  }
}
