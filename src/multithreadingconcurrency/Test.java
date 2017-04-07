/*
 * Using java.util.concurrency please implement our Adunare and Scadere example to obtain a better  synchronisation. 
 */
package multithreadingconcurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;

/**
 * java.util.concurrency
 *
 * @author Doru
 */
public class Test {

// the name of the file where results are stored
    static final String FILE_NAME = "Counter.txt";

    private static final int QUEUE_SIZE = 10; // the size of the blocking queue

    private static final int TIMES_TO_MODIFY_COUNTER = 30;

    private static final int SIZE_OF_POOL = 10; // the size of the thread pool

    public static void main(String[] args) {
        Counter counter = new Counter(); // create the counter

        BlockingQueue<String> queue = new ArrayBlockingQueue<>(QUEUE_SIZE);

        CountDownLatch latch = new CountDownLatch(TIMES_TO_MODIFY_COUNTER * 2);

        ExecutorService pool = Executors.newFixedThreadPool(SIZE_OF_POOL);

        System.out.println("START\n");

        for (int i = 0; i < TIMES_TO_MODIFY_COUNTER; i++) {
            pool.submit(new Adunare(counter, queue, latch));
            pool.submit(new Scadere(counter, queue, latch));
        }
        pool.shutdown();

        new Thread(new Writer(queue)).start();
        try {
            latch.await();
            System.out.println("\nSTOP\n\nThe final value of the counter is: " + counter.getCount());
            queue.put("STOP"); // writer thread stop
        } catch (InterruptedException iex) {
            Logger.getGlobal().severe(iex.toString());
        }
    }

}
