
package builder;

public abstract class SmartphoneBuilder{

  protected Smartphone Smartphone;

  public SmartphoneBuilder() {
    Smartphone = new Smartphone();
  }

  public abstract void buildPreco();

  public abstract void buildprocessador();

  public abstract void buildanodefabricacao();

  public abstract void buildModelo();

  public abstract void buildmarca();

  public Smartphone getSmartphone() {
    return Smartphone;
  }
}