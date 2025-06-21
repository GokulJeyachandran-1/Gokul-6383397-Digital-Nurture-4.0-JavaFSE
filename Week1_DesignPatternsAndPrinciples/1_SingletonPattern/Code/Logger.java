public class Logger {
    // Static instance to hold the single Logger object
    private static Logger instance = null;

    // Private constructor to prevent external instantiation
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // Public static method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Lazy initialization - create instance only when needed
        }
        return instance;
    }

    // Logging method
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}

