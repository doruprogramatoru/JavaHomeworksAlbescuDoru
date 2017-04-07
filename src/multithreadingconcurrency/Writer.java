/*
 * java.util.concurrency
 */
package multithreadingconcurrency;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Logger;

/**
 * Writes the strings from a blocking queue to a file.
 *
 * @author Doru
 */
class Writer implements Runnable {

    private final BlockingQueue<String> queue; // reference to the blocking queue

    Writer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Test.FILE_NAME))) {
            boolean done = false;

            while (!done) {
                String string = queue.take();
                if (!string.equals("STOP")) {
                    writer.append(string);
                } else {
                    done = true;
                }
            }
        } catch (IOException | InterruptedException ex) {
            Logger.getGlobal().severe(ex.toString());
        }
    }
}
