
public class Singleton {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First logger message");
        logger2.log("Second logger message");

        System.out.println("Are both loggers the same instance? " + (logger1.equals(logger2)));
    }
}
