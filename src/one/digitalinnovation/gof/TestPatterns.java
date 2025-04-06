package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;
import one.digitalinnovation.gof.observer.*;
import one.digitalinnovation.gof.factory.*;


public class TestPatterns {

    public static void main(String[] args) {
        // Teste dos padrões originais
        testSingleton();
        testStrategy();
        testFacade();
        
        // Teste dos novos padrões
        testObserver();
        testFactoryMethod();
    }
    
    private static void testSingleton() {
        System.out.println("\n==== Testando o Padrão Singleton ====\n");
        
        // Singleton Lazy
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println("Instância Singleton Lazy: " + lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println("Instância Singleton Lazy (confirmação): " + lazy);
        
        // Singleton Eager
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println("\nInstância Singleton Eager: " + eager);
        eager = SingletonEager.getInstancia();
        System.out.println("Instância Singleton Eager (confirmação): " + eager);
        
        // Singleton LazyHolder
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println("\nInstância Singleton LazyHolder: " + lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println("Instância Singleton LazyHolder (confirmação): " + lazyHolder);
    }
    
    private static void testStrategy() {
        System.out.println("\n==== Testando o Padrão Strategy ====\n");
        
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        
        Robo robo = new Robo();
        
        System.out.println("Comportamento Normal:");
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        
        System.out.println("\nComportamento Defensivo:");
        robo.setComportamento(defensivo);
        robo.mover();
        
        System.out.println("\nComportamento Agressivo:");
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
    }
    
    private static void testFacade() {
        System.out.println("\n==== Testando o Padrão Facade ====\n");
        
        Facade facade = new Facade();
        facade.migrarCliente("Carlos Eduardo", "14801788");
    }
    
    private static void testObserver() {
        System.out.println("\n==== Testando o Padrão Observer ====\n");
        
        // Criando o sujeito (subject)
        NewsletterSubject newsletter = new NewsletterSubject();
        
        // Criando observadores
        Observer emailClient1 = new EmailClient("usuario1@email.com");
        Observer emailClient2 = new EmailClient("usuario2@email.com");
        Observer mobileApp = new MobileApp("Maria");
        
        // Registrando observadores
        newsletter.addObserver(emailClient1);
        newsletter.addObserver(emailClient2);
        newsletter.addObserver(mobileApp);
        
        // Envio de mensagem para todos os observadores
        System.out.println("Primeira notificação (todos os observadores):");
        newsletter.setMessage("Nova funcionalidade disponível no sistema!");
        
        // Removendo um observador
        newsletter.removeObserver(emailClient2);
        
        // Nova mensagem apenas para os observadores que permaneceram
        System.out.println("\nSegunda notificação (após remover um observador):");
        newsletter.setMessage("Manutenção programada para amanhã às 23h!");
    }
    
    private static void testFactoryMethod() {
        System.out.println("\n==== Testando o Padrão Factory Method ====\n");
        
        // Criando fábricas de veículos
        VeiculoFactory carroFactory = new CarroFactory();
        VeiculoFactory motoFactory = new MotoFactory();
        VeiculoFactory caminhaoFactory = new CaminhaoFactory();
        
        // Utilizando o método de teste comum
        System.out.println("Testando um carro pela fábrica:");
        carroFactory.testarVeiculo();
        
        System.out.println("\nTestando uma moto pela fábrica:");
        motoFactory.testarVeiculo();
        
        System.out.println("\nTestando um caminhão pela fábrica:");
        caminhaoFactory.testarVeiculo();
        
        // Criando diretamente um veículo
        System.out.println("\nUsando um veículo específico:");
        Veiculo meuCarro = carroFactory.criarVeiculo();
        meuCarro.dirigir();
        meuCarro.parar();
    }
}
