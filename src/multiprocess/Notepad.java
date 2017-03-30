/*
 * Create an application that launches three instances of Notepad
 */
package multiprocess;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Multiprocess
 *
 * @author Doru
 */
public class Notepad {

    public static void main(String[] args) {
        try {
            ProcessBuilder pb;
            // Use process builder to start three instances of Notepad
            pb = new ProcessBuilder("notepad.exe");
            Process p1 = pb.start();
            Process p2 = pb.start();
            Process p3 = pb.start();
        } catch (IOException ex) {
            Logger.getLogger(Notepad.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);
        }
    }

}
