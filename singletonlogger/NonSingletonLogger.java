package singletonlogger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class NonSingletonLogger {
    private final LogLevel level;
    private final String logFile;
    private PrintWriter writer;

    public NonSingletonLogger(String logFile, LogLevel level) {
        this.logFile = logFile;
        this.level = level;
        try {
            FileWriter fileWriter = new FileWriter(logFile, true);
            writer = new PrintWriter(fileWriter, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void log(LogLevel level, String message) {
        if (this.level.ordinal() <= level.ordinal()) {
            String logMessage = level + ": " + message;
            System.out.println(logMessage);
            if (writer != null) {
                writer.println(logMessage);
            }
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

    public void close() {
        if (writer != null) {
            writer.close();
        }
    }
}
