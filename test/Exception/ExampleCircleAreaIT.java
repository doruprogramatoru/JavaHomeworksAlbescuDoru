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
    }

    /**
     * Test of circleArea method, of class ExampleCircleArea.
     */
    @Test
    public void testCircleArea() throws Exception {
        System.out.println("circleArea");
        double radius = 10.5;
        double expResult = 346.36059005827474;
        double result = ExampleCircleArea.circleArea(radius);
        assertEquals(expResult, result, 0.0);
    }

}
