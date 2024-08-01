package singletonlogger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static final String LOG_FILE = "app.log";
    private static Logger singleInstance = null;
    private PrintWriter writer;

    private Logger() {
        try {
            FileWriter fileWriter = new FileWriter(LOG_FILE, true);
            writer = new PrintWriter(fileWriter, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (singleInstance == null) {
            synchronized (Logger.class) {
                if (singleInstance == null) {
                    singleInstance = new Logger();
                }
            }
        }
        return singleInstance;
    }

    private void log(LogLevel level, String message) {
        String logMessage = level + ": " + message;
        System.out.println(logMessage);
        if (writer != null) {
            writer.println(logMessage);
        }
    }

    public void logInfo(String message) {
        log(LogLevel.INFO, message);
    }

    public void logDebug(String message) {
        log(LogLevel.DEBUG, message);
    }

    public void logWarn(String message) {
        log(LogLevel.WARN, message);
    }

    public void logError(String message) {
        log(LogLevel.ERROR, message);
    }
}
