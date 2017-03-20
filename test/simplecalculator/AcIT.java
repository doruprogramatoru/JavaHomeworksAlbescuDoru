/*
 * JUnit based unitary test
 */
package simplecalculator;

import org.junit.Test;
import static org.junit.Assert.*;

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
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
