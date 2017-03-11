/*
 * Example Logger
 */
package exception;

/**
 * Logger
 *
 * @author Doru
 */
import java.util.logging.Level;
import java.io.*;

public class ExampleLogger {

    private static ExampleLogger logger = ExampleLogger.getLogger("my.class.fqn");

    public static void main(String[] args) {
        logger.info("start main");
        try {
            String file = "C:\\Users\\Doru\\Documents\\JAVA\\7\\file.txt";
            readFirstLine(file);
            //more code that throws exceptions
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error during run", e);
        }
        logger.info("end main");
    }

    public static void readFirstLine(String file) {
        try (BufferedReader r = new BufferedReader(new FileReader(file))) {
            String firstLine = r.readLine();
        } catch (IOException e) {
            //do not log here
            throw new RuntimeException("cannot read first line from file " + file, e);
        }
    }

    private static ExampleLogger getLogger(String myclassfqn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void info(String start_main) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void log(Level SEVERE, String error_during_run, Exception e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
