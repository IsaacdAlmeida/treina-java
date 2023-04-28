public class Alimento extends ItemDeLoja {
  private Integer selo;

  public Integer getSelo() {
    return selo;
  }

  public void setSelo(Integer selo) {
    this.selo = selo;
  }

  @Override
  public Integer getIdentificador() {
    return this.getSelo();
  }

}
