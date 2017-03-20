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
public class MultiplyIT {

    public MultiplyIT() {
    }

    /**
     * Test of multiplying method, of class Multiply.
     */
    @Test
    public void testMultiplying() {
        System.out.println("multiplying");
        double parameter1 = 0.0;
        double parameter2 = 0.0;
        double expResult = 0.0;
        double result = Multiply.multiplying(parameter1, parameter2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
