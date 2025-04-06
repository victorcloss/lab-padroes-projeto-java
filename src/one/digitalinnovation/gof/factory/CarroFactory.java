package one.digitalinnovation.gof.factory;

public class CarroFactory extends VeiculoFactory {
    @Override
    public Veiculo criarVeiculo() {
        return new Carro();
    }
}