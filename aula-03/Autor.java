public class Autor {
  String authorName;
  String authorEmail;
  String authorCpf;

  void showAuthorDetails() {
    System.out.println("Autor: " + authorName);
    System.out.println("Email do autor: " + authorEmail);
    System.out.println("CPF do autor: " + authorCpf);
  }
}
