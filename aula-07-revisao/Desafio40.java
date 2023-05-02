import java.util.Scanner;

public class Desafio40 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o lado 1: ");
    int x = sc.nextInt();

    System.out.println("Digite o lado 2: ");
    int y = sc.nextInt();

    System.out.println("Digite o lado 3: ");
    int z = sc.nextInt();

    sc.close();

    if(x>=y+z || y>=z+x || z>=x+y) System.out.println("Não é possível formar um triẫngulo");

    if (x==y && y==z) {
      System.out.println("EQUILÁTERO");
    } else if (x==y || y==z || z==x){
      System.out.println("ISÓSCELES");
    } else {
      System.out.println("ESCALENO");
    }
  }
}