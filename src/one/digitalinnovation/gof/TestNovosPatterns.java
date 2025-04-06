package one.digitalinnovation.gof;

import one.digitalinnovation.gof.observer.*;
import one.digitalinnovation.gof.factory.*;

public class TestNovosPatterns {

    public static void main(String[] args) {
        // Teste do padrão Observer
        System.out.println("==== Testando o Padrão Observer ====");
        NewsletterSubject newsletter = new NewsletterSubject();
        
        Observer emailClient1 = new EmailClient("usuario1@email.com");
        Observer emailClient2 = new EmailClient("usuario2@email.com");
        Observer mobileApp = new MobileApp("João");
        
        newsletter.addObserver(emailClient1);
        newsletter.addObserver(emailClient2);
        newsletter.addObserver(mobileApp);
        
        // Envia uma notificação para todos os observadores
        newsletter.setMessage("Nova promoção disponível!");
        
        // Remove um observador
        newsletter.removeObserver(emailClient2);
        
        // Envia outra notificação
        newsletter.setMessage("Atualização de sistema prevista para amanhã!");
        
        // Teste do padrão Factory Method
        System.out.println("\n==== Testando o Padrão Factory Method ====");
        
        // Criando fábricas
        VeiculoFactory carroFactory = new CarroFactory();
        VeiculoFactory motoFactory = new MotoFactory();
        VeiculoFactory caminhaoFactory = new CaminhaoFactory();
        
        // Criando e testando veículos usando as fábricas
        System.out.println("\nTestando Carro:");
        carroFactory.testarVeiculo();
        
        System.out.println("\nTestando Moto:");
        motoFactory.testarVeiculo();
        
        System.out.println("\nTestando Caminhão:");
        caminhaoFactory.testarVeiculo();
        
        // Criando diretamente e usando o produto
        System.out.println("\nCriando e testando instâncias específicas:");
        Veiculo meuCarro = carroFactory.criarVeiculo();
        meuCarro.dirigir();
        
        Veiculo minhaMoto = motoFactory.criarVeiculo();
        minhaMoto.parar();
    }
}