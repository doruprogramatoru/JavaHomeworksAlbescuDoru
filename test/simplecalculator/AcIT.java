/*
 * JUnit based unitary test
 */
package simplecalculator;

import org.junit.Test;

/**
 * JUnit based unitary test
 *
 * @author Doru
 */
public class AcIT {

    public AcIT() {
    }

    /**
     * Test of allclear method, of class Ac.
     */
    @Test
    public void testAllclear() {
        System.out.println("allclear");
        String s = "";
        Ac.allclear(s);
    }

}
