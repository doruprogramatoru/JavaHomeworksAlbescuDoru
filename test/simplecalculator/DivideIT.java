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
public class DivideIT {

    public DivideIT() {
    }

    /**
     * Test of dividing method, of class Divide.
     */
    @Test
    public void testDividing() {
        System.out.println("dividing");
        double parameter1 = 14.0;
        double parameter2 = 7.0;
        double expResult = 2;
        double result = Divide.dividing(parameter1, parameter2);
        assertEquals(expResult, result, 0.0);
    }

}
