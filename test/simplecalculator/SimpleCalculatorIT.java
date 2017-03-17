/*
 * Java Unit Test
 */
package simplecalculator;

import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Java Unit Test
 *
 * @author Doru
 */
public class SimpleCalculatorIT {

    public SimpleCalculatorIT() {
    }

    /**
     * Test of main method, of class SimpleCalculator.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of calculate method, of class SimpleCalculator.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of closeCalculator method, of class SimpleCalculator.
     */
    @Test
    public void testCloseCalculator() {
        System.out.println("closeCalculator");
        String s = "";
        SimpleCalculator.closeCalculator(s);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of readParam1 method, of class SimpleCalculator.
     */
    @Test
    public void testReadParam1() {
        System.out.println("readParam1");
        Scanner scan = null;
        double expResult = 0.0;
        double result = 0.0;
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of readParam2 method, of class SimpleCalculator.
     */
    @Test
    public void testReadParam2() {
        System.out.println("readParam2");
        Scanner scan = null;
        double expResult = 0.0;
        double result = 0.0;
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of readOper method, of class SimpleCalculator.
     */
    @Test
    public void testReadOper() {
        System.out.println("readOper");
        Scanner scan = null;
        String expResult = "";
        String result = "";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
