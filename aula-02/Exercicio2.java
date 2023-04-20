import java.util.Scanner;

public class Exercicio2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("digite a frase: ");
    String userInput = sc.nextLine();

    sc.close();

    String phrase = userInput;
    char somechar = 'a';
    int count = 0;

    for (int i = 0; i < phrase.length(); i++) {
      if (phrase.toLowerCase().charAt(i) == somechar) {
        count++;
      }
    }

    System.out.println(count);
  }
}
