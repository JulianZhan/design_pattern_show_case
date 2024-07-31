package observerformail;
public class User implements Observer {
    private String email;

    public User(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        sendEmail(message);
    }

    private void sendEmail(String message) {
        System.out.println("Sending email to " + email + ": " + message);
    }
}