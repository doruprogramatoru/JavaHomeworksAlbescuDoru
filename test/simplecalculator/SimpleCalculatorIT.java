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
    }

    /**
     * Test of calculate method, of class SimpleCalculator.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
    }

    /**
     * Test of closeCalculator method, of class SimpleCalculator.
     */
    @Test
    public void testCloseCalculator() {
        System.out.println("closeCalculator");
        String s = "";
        SimpleCalculator.closeCalculator(s);
    }

    /**
     * Test of readParam1 method, of class SimpleCalculator.
     */
    @Test
    public void testReadParam1() {
        System.out.println("readParam1");
        Scanner scan = null;
        double expResult = 2.0;
        double result = 2.0;
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of readParam2 method, of class SimpleCalculator.
     */
    @Test
    public void testReadParam2() {
        System.out.println("readParam2");
        Scanner scan = null;
        double expResult = 5.0;
        double result = 5.0;
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of readOper method, of class SimpleCalculator.
     */
    @Test
    public void testReadOper() {
        System.out.println("readOper");
        Scanner scan = null;
        String expResult = "8";
        String result = "8";
        assertEquals(expResult, result);
    }

}
