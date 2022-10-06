
package builder;


public class LojaDirector {
  protected SmartphoneBuilder marca;

  public LojaDirector(SmartphoneBuilder marca) {
    this.marca = marca;
  }

  public void construirCelular() {
    marca.buildPreco();
    marca.buildanodefabricacao();
    marca.buildprocessador();
    marca.buildModelo();
    marca.buildmarca();
  }

  public Smartphone getCelular() {
    return marca.getSmartphone();
  }
}

