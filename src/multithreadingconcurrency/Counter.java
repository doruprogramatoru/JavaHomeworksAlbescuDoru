/*
 * java.util.concurrency
 */
package multithreadingconcurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * The counter which can be incremented and decremented.
 *
 * @author Doru
 */
class Counter {

    private final AtomicInteger count; // the count

    Counter() {
        count = new AtomicInteger();
    }

    int increment() {
        return count.incrementAndGet();
    }

    int decrement() {
        return count.decrementAndGet();
    }

    int getCount() {
        return count.get();
    }
}
