package singletonlogger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.logInfo("This is an info message.");
        logger.logDebug("This is a debug message.");
        logger.logWarn("This is a warning message.");
        logger.logError("This is an error message.");

        Logger anotherLogger = Logger.getInstance();
        if (logger == anotherLogger) {
            logger.logInfo("SAME.");
        }
    }
}
