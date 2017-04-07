/*
 * java.util.concurrency
 */
package multithreadingconcurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;

/**
 * Decrements the counter.
 *
 * @author Doru
 */
class Scadere implements Runnable {

    private final Counter counter; // reference to the counter
    private final BlockingQueue queue; // reference to the blocking queue
    private final CountDownLatch latch; // reference to the countdown latch

    Scadere(Counter counter, BlockingQueue queue, CountDownLatch latch) {
        this.counter = counter;
        this.queue = queue;
        this.latch = latch;
    }

    @Override
    public void run() {
        String result = String.format("I decremented the counter and now it has the value: %d %n", counter.decrement());

        try {
            queue.put(result);
        } catch (InterruptedException iex) {
            Logger.getGlobal().severe(iex.toString());
        }

        System.out.print(result);

        latch.countDown();
    }
}
