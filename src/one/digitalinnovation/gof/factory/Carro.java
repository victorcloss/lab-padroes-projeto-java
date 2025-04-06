package one.digitalinnovation.gof.factory;

public class Carro implements Veiculo {
    @Override
    public void dirigir() {
        System.out.println("Dirigindo o carro...");
    }

    @Override
    public void parar() {
        System.out.println("Parando o carro...");
    }
}