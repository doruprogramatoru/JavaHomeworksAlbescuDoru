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
public class PlusIT {

    public PlusIT() {
    }

    /**
     * Test of add method, of class Plus.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double parameter1 = 0.0;
        double parameter2 = 0.0;
        double expResult = 0.0;
        double result = Plus.add(parameter1, parameter2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
