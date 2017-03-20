/*
 * JUnit based unitary test
 */
package simplecalculator;

import static java.lang.Double.NaN;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit based unitary test
 *
 * @author Doru
 */
public class DivideIT {

    public DivideIT() {
    }

    /**
     * Test of dividing method, of class Divide.
     */
    @Test
    public void testDividing() {
        System.out.println("dividing");
        double parameter1 = 0.0;
        double parameter2 = 0.0;
        double expResult = NaN;
        double result = Divide.dividing(parameter1, parameter2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
