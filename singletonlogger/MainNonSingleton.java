package singletonlogger;

public class MainNonSingleton {
    public static void main(String[] args) {
        NonSingletonLogger appLogger = new NonSingletonLogger("appNonSingleton.log", LogLevel.INFO);
        appLogger.logInfo("This is an info message.");
        appLogger.logDebug("This is a debug message.");
        appLogger.logWarn("This is a warning message.");
        appLogger.logError("This is an error message.");

        NonSingletonLogger securityLogger = new NonSingletonLogger("security.log", LogLevel.DEBUG);
        securityLogger.logInfo("Security info message.");
        securityLogger.logDebug("Security debug message.");
        securityLogger.logWarn("Security warning message.");
        securityLogger.logError("Security error message.");

        appLogger.close();
        securityLogger.close();
    }
}
