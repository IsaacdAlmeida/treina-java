public class Loops {
  public static void main(String[] args) {

    double soma = 0;

    // while (contador < 35) {
    //   double livroJava = 59.90;

    //   soma += livroJava;

    //   contador += 1;

    //   if (soma > 1500) break;

    // }

    for(int index = 0; index < 35; index += 1) {
      double livro = 59.90;
      soma += livro;

      if (index % 2 != 0) continue;

      if (soma > 1000) break;
    }

    System.out.printf("%.2f", soma);
  }
};

