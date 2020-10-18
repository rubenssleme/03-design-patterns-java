package padroesgof;

import java.util.logging.Level;

public class Logger {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Logger.class.getName());

    private Logger() {
    }

    public static void log(Object msg) {
        System.out.println(msg);
    }

    public static void log(Exception e) {
        logger.log(Level.SEVERE, e.getMessage(), e);
    }
}
