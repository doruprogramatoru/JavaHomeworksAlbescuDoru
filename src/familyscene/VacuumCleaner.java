/*
 * Family scene
 */
package familyscene;

/**
 *
 * @author Doru
 */
public class VacuumCleaner extends Thread {

    @Override
    public void run() {
        System.out.println("Han Solo has turned on the vacuum cleaner. "
                + "Vacuum cleaner is running. ");
    }
}
