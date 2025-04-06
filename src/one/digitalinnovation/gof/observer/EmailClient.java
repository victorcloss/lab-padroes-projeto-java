package one.digitalinnovation.gof.observer;

public class EmailClient implements Observer {
    private String email;

    public EmailClient(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("Email enviado para " + email + ": " + message);
    }
}