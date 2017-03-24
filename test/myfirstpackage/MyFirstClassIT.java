/*
 * Java Unit Test
 */
package myfirstpackage;

import org.junit.Test;

/**
 * Java Unit Test
 *
 * @author Doru
 */
public class MyFirstClassIT {

    public MyFirstClassIT() {
    }

    /**
     * Test of main method, of class MyFirstClass.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MyFirstClass.main(args);
    }

}
