package one.digitalinnovation.gof.factory;

public abstract class VeiculoFactory {
    public abstract Veiculo criarVeiculo();
    
    // Método comum a todas as fábricas
    public void testarVeiculo() {
        Veiculo veiculo = criarVeiculo();
        veiculo.dirigir();
        veiculo.parar();
    }
}