public abstract class ItemDeLoja {

  private Integer codigoDoItem;
  private String nomeDoItem;
  private String descricaoDoItem;
  private Double valorDoItem;

  public Integer getCodigoDoItem() {
    return codigoDoItem;
  }

  public void setCodigoDoItem(Integer codigoDoItem) {
    this.codigoDoItem = codigoDoItem;
  }

  public String getNomeDoItem() {
    return nomeDoItem;
  }

  public void setNomeDoItem(String nomeDoItem) {
    this.nomeDoItem = nomeDoItem;
  }

  public String getDescricaoDoItem() {
    return descricaoDoItem;
  }

  public void setDescricaoDoItem(String descricaoDoItem) {
    this.descricaoDoItem = descricaoDoItem;
  }

  public Double getValorDoItem() {
    return valorDoItem;
  }

  public void setValorDoItem(Double valorDoItem) {
    this.valorDoItem = valorDoItem;
  }

  public abstract Integer getIdentificador();
}