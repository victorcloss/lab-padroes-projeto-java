package one.digitalinnovation.gof.factory;

public class Moto implements Veiculo {
    @Override
    public void dirigir() {
        System.out.println("Pilotando a moto...");
    }

    @Override
    public void parar() {
        System.out.println("Parando a moto...");
    }
}
