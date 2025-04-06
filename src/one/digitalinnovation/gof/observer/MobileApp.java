package one.digitalinnovation.gof.observer;

public class MobileApp implements Observer {
    private String userName;

    public MobileApp(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String message) {
        System.out.println("Notificação enviada para o app do usuário " + userName + ": " + message);
    }
}