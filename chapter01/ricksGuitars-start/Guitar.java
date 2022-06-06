public class Guitar {

  private String serialNumber;
  private Builder builder;
  private String model;
  private Type type;
  private BackWood backWood;
  private String topWood;
  private double price;

  public Guitar(String serialNumber, double price,
                Builder builder, String model, Type type,
                BackWood backWood, String topWood) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public double getPrice() {
    return price;
  }
  public void setPrice(float newPrice) {
    this.price = newPrice;
  }
  public Builder getBuilder() {
    return builder;
  }
  public String getModel() {
    return model;
  }
  public Type getType() {
    return type;
  }
  public BackWood getBackWood() {
    return backWood;
  }
  public String getTopWood() {
    return topWood;
  }
}
