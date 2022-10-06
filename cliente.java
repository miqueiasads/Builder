
package builder;

public class cliente{
    public static void main(String[] args){
        
        LojaDirector Fast = new LojaDirector(new AppleBuilder());
        Fast.construirCelular();
        Smartphone Smartphone = Fast.getCelular();
        System.out.println("Modelo: " + Smartphone.modelo + "\nMarca: " + Smartphone.marca
	            + "\nAno de Lançamento: " + Smartphone.anodefabricacao + "\nProcessador :"
	            + Smartphone.processador+ "\nValor: " + Smartphone.preco);
    }
}