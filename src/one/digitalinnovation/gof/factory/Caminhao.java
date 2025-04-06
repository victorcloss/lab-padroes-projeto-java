package one.digitalinnovation.gof.factory;

public class Caminhao implements Veiculo {
    @Override
    public void dirigir() {
        System.out.println("Conduzindo o caminhão...");
    }

    @Override
    public void parar() {
        System.out.println("Parando o caminhão...");
    }
}