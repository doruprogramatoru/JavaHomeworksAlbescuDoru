/*
 * Given the following class, called NumberHolder, write some code that creates
 * an instance of the class, initializes its two member variables, and then 
 * displays the value of each member variable.
 * public class NumberHolder {
 * public int anInt;
 * public float aFloat;}
 */
package numberholder;

/**
 * Number Holder
 * @author Doru
 */
public class NumberHolder {
    
public int anInt;

public float aFloat;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumberHolder n = new NumberHolder();//Create the 'NumberHolder' object;
        
        n.anInt = 3;
        n.aFloat =2.3f;
        
        System.out.println("The integer value of n is :" + n.anInt);
        System.out.println("The float value of n is :" + n.aFloat);

    }
    
}
