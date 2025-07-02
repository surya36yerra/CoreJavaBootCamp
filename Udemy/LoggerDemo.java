package Udemy;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerDemo {

    private static Logger logger = Logger.getLogger(LoggerDemo.class.getName());
    public static void main(String[] args) {
        logger.info("Hello World");
        logger.severe("Hello World-severe");

        logger.log(Level.INFO, "Hello World-info");
        logger.setLevel(Level.SEVERE);
    }
}
