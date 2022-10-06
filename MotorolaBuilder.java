
package builder;

public class MotorolaBuilder extends SmartphoneBuilder {

  @Override
  public void buildPreco() {
    // Operação complexa.
    Smartphone.preco = "3000.00";
  }

  @Override
  public void buildprocessador() {
    // Operação complexa.
    Smartphone.processador = "2GHz Octa-Core";
  }

  @Override
  public void buildanodefabricacao() {
    // Operação complexa.
    Smartphone.anodefabricacao = 2017;
  }

  @Override
  public void buildModelo() {
    // Operação complexa.
    Smartphone.modelo = "Motorola One";
  }

  @Override
  public void buildmarca() {
    // Operação complexa.
    Smartphone.marca = "Motorola";
  }
}

