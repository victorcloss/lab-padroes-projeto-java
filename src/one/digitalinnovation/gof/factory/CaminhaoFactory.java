package one.digitalinnovation.gof.factory;


public class CaminhaoFactory extends VeiculoFactory {
    @Override
    public Veiculo criarVeiculo() {
        return new Caminhao();
    }
}
