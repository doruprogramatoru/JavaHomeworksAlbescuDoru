/*
 * Family scene
 */
package familyscene;

/**
 *
 * @author Doru
 */
public class Husband extends Thread {

    private final Thread vacuumCleaner;
    private final Thread wife;

    public Husband(Thread wife, Thread vacuumCleaner) {
        super("Husband");
        this.wife = wife;
        this.vacuumCleaner = vacuumCleaner;
    }

    @Override
    public void run() {
        System.out.println("Han Solo enters the scene. ");
        wife.start();
        vacuumCleaner.start();
        while (true) {
            synchronized (this) {
                try {
                    System.out.println("Han Solo is vacuuming.");
                    sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Han Solo has just turned off the vacuum cleaner.");
                    vacuumCleaner.interrupt();
                    System.out.println("He needs to wake up Princess Leia.");
                    wife.interrupt();
                    break;
                }
            }
        }
    }

    public TvShows getWifeFavouriteShow() {
        return ((Wife) wife).getHerFavouriteShow();
    }

}
