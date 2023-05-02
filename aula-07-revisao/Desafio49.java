import java.util.Scanner;

public class Desafio49 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite seu peso em Kgs: ");
    double peso = sc.nextDouble();

    System.out.println("Digite sua altura em metros: ");
    double altura = sc.nextDouble();

    sc.close();

    double imc = peso / Math.pow(altura, 2);

    String situacao = "";

    if (imc < 20) {
      situacao = "Abaixo do peso";
    } else if (imc < 25) {
      situacao = "Peso nromal";
    } else if (imc < 30) {
      situacao = "sobrepeso";
    } else if (imc < 40) {
      situacao = "obeso";
    } else {
      situacao = "obeso mórbido";
    }

    System.out.println("IMC: " + imc + " - " + situacao);
  }
}
