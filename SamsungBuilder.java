
package builder;

public class SamsungBuilder extends SmartphoneBuilder {
   
  @Override
  public void buildPreco() {
    // Operação complexa.
    Smartphone.preco = "4000.00";
  }

  @Override
  public void buildprocessador() {
    // Operação complexa.
    Smartphone.processador = "2GHz Octa-Core";
  }

  @Override
  public void buildanodefabricacao() {
    // Operação complexa.
    Smartphone.anodefabricacao = 2015;
  }

  @Override
  public void buildModelo() {
    // Operação complexa.
    Smartphone.modelo = "Samsung Galaxy A13";
  }

  @Override
  public void buildmarca() {
    // Operação complexa.
    Smartphone.marca = "Samsung";
  }
}

