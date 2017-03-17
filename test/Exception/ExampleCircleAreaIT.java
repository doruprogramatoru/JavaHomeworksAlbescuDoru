/*
 * Java Unit Test
 */
package Exception;

import exception.ExampleCircleArea;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Java Unit Test
 *
 * @author Doru
 */
public class ExampleCircleAreaIT {

    public ExampleCircleAreaIT() {
    }

    /**
     * Test of main method, of class ExampleCircleArea.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args;
        args = null;
        ExampleCircleArea.main(args);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of circleArea method, of class ExampleCircleArea.
     */
    @Test
    public void testCircleArea() throws Exception {
        System.out.println("circleArea");
        double radius = 0.0;
        double expResult = 0.0;
        double result = 0.0;
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
