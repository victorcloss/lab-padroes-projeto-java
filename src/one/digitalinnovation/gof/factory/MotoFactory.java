package one.digitalinnovation.gof.factory;


public class MotoFactory extends VeiculoFactory {
    @Override
    public Veiculo criarVeiculo() {
        return new Moto();
    }
}