/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;

/**
 *
 * @author Doru
 */
public class EqualIT {
    
    public EqualIT() {
    }

    /**
     * Test of getResult method, of class Equal.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        double displayed = 0.0;
        Equal instance = new Equal();
        instance.getResult(displayed);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
