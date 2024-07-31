package observerformail;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EmailScheduler {
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    private final EmailService emailService;

    public EmailScheduler(EmailService emailService) {
        this.emailService = emailService;
    }

    public void startDailyEmails() {
        Runnable sendEmails = () -> emailService.notifyObservers("Daily email content");
        scheduler.scheduleAtFixedRate(sendEmails, 0, 1, TimeUnit.DAYS);
    }
}