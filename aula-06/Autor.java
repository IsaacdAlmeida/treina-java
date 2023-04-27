public class Autor {
  private String authorName;
  private String authorEmail;
  private String authorCpf;

  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public String getAuthorEmail() {
    return authorEmail;
  }

  public void setAuthorEmail(String authorEmail) {
    this.authorEmail = authorEmail;
  }

  public String getAuthorCpf() {
    return authorCpf;
  }

  public void setAuthorCpf(String authorCpf) {
    this.authorCpf = authorCpf;
  }

  void showAuthorDetails() {
    System.out.println("Autor: " + authorName);
    System.out.println("Email do autor: " + authorEmail);
    System.out.println("CPF do autor: " + authorCpf);
  }
}
