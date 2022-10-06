
package builder;


public class AppleBuilder extends SmartphoneBuilder {

  @Override
  public void buildPreco() {
    // Operação complexa.
    Smartphone.preco = "5000.00";
  }

  @Override
  public void buildprocessador() {
    // Operação complexa.
    Smartphone.processador = "Apple A12 Bionic";
  }

  @Override
  public void buildanodefabricacao() {
    // Operação complexa.
    Smartphone.anodefabricacao = 2018;
  }

  @Override
  public void buildModelo() {
    // Operação complexa.
    Smartphone.modelo = "iPhone XR";
  }

  @Override
  public void buildmarca() {
    // Operação complexa.
    Smartphone.marca = "Apple";
  }
}
