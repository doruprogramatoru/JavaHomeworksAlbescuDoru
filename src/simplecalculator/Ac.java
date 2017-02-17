/*
 * AC stands for All Clear and so the calculator will display 0
 */
package simplecalculator;

/**
 *
 * @author Doru
 */
public class Ac {
    
    /**
     * All Clear and display 0;
     * @param s
     */
    public static void allclear(String s ){
        if (s.equalsIgnoreCase("AC")){
            System.out.println("0");
        
            SimpleCalculator.calculate();
        }
        
    }
}