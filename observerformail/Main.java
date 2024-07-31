package observerformail;

public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();

        User user1 = new User("user1@example.com");
        User user2 = new User("user2@example.com");

        emailService.registerObserver(user1);
        emailService.registerObserver(user2);

        EmailScheduler scheduler = new EmailScheduler(emailService);
        scheduler.startDailyEmails();
    }
}