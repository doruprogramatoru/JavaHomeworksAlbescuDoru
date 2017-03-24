/*
 * JUnit based unitary test
 */
package simplecalculator;

import org.junit.Test;

/**
 * JUnit based unitary test
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
    }

}
