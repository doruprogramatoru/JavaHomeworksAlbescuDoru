/*
 * Family scene
 */
package familyscene;

import java.util.Random;

/**
 * Implementing a new thread extending class Thread
 *
 * @author Doru
 */
public class Wife extends Thread {

    private final Thread womanCigar;
    private final TvShows herFavouriteShow;

    public Wife(Thread cigar) {
        super("Wife");
        this.womanCigar = cigar;
        this.herFavouriteShow = TvShows.values()[(new Random()).nextInt(TvShows.values().length)];
    }

    @Override
    public void run() {
        System.out.println("Princess Leia enters the scene. ");
        womanCigar.start();
        while (true) {
            synchronized (this) {
                try {
                    System.out.println("Princess Leia is sleeping.");
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Princess Leia is awake!");
                    System.out.println("Princess Leia will put aside the cigar...");
                    womanCigar.interrupt();
                    System.out.println(" and will enjoy her favourite show: "
                            + herFavouriteShow);
                    break;
                }
            }
        }
    }

    public TvShows getHerFavouriteShow() {
        return herFavouriteShow;
    }

}
