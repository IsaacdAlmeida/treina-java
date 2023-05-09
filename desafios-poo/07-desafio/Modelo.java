public class Modelo extends Carro {
  private int codigo;
  private String marca;
  private String nome;
  private Double motor;
  private int serie;

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double getMotor() {
    return motor;
  }

  public void setMotor(Double motor) {
    this.motor = motor;
  }

  public int getSerie() {
    return serie;
  }

  public void setSerie(int serie) {
    this.serie = serie;
  }

}
