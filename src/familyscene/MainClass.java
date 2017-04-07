/*
 * Family scene
 */
package familyscene;

/**
 *
 * @author Doru
 */
public class MainClass {

    public static void main(String args[]) {
        Thread tv = new Tv(new Husband(new Wife(new Cigar()), new VacuumCleaner()));
        tv.start();
    }
}
