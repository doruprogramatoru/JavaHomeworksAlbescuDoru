/*
 * Equal class will return the result of the operations
 */
package simplecalculator;

import java.util.Scanner;

/**
 *
 * @author Doru
 */
public class Equal {

    // the displayed method will be called getResult;
    public void getResult(double displayed) {
        System.out.println("To get the result press '='!");
        Scanner scan2 = new Scanner(System.in);
        String s = scan2.nextLine();
        // if the user press = than the result will be listed;
        if (s.equals("=")) {
            System.out.println("Your result is: " + displayed);
        } else { //othervise the calculator stops with error;
            System.out.println("In order to run the application you should press =. Please try it again!");
            Ac.allclear(s);
        }
        SimpleCalculator.closeCalculator(s);

    }

}
