public class Logger {
    private static Logger loggerInstance;

    // Private constructor to prevent instantiation
    private Logger() {}

    // Public method to get the singleton instance
    public static Logger getInstance() {
        if (loggerInstance == null) {
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }

    // Logging method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
