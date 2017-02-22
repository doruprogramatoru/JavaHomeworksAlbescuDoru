/*
 * This is my homework: Simple calculator
 */
package simplecalculator;

/**
 * Simple Calculator
 * @author Doru
 */
import java.util.Scanner;

public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("0");//calculator displays 0 value by default;
        
        calculate();//run the method calculate;
    }

    // implemet the calculate method;
    public static void calculate() {
        
        String operator;//declare a string variable named "operator";
        Scanner scan = new Scanner(System.in);//create a Scanner object named "scan";
        
        Plus add = new Plus();//create an actor Plus;
        Equal equals = new Equal();  //create an actor Equal;
        Minus decrease = new Minus();//create an actor Minus;
        Multiply multiply = new Multiply();//create an actor Multiply;
        Divide divide = new Divide();//create an actor Divide;
        
        double oper1;
        oper1 = readParam1(scan);//read first parameter;
        operator = readOper(scan);//read operator;
        double oper2;
        oper2 = readParam2(scan);//read second parameter;

        //get the result, depending on the selected operator 
        switch (operator) {
            case "+": {
                equals.getResult(Plus.add(oper1, oper2));
                break;
            }
            case "-": {
                equals.getResult(Minus.decrease(oper1, oper2));
                break;
            }
            case "*": {
                equals.getResult(Multiply.multiplying(oper1, oper2));
                break;
            }
            case "/": {
                equals.getResult(Divide.dividing(oper1, oper2));
                break;
            }

            default: {
                System.out.println("The operator you choose is not valid. Take it from the beginning.");
                Ac.allclear(operator);
                closeCalculator(operator);
                break;
            }
        }
    }

    /**
     * if any letter key [a-z] is introduced will exit the application
     *
     * @param s
     */

    public static void closeCalculator(String s) {
        if (s.matches(".*[a-z].*")) {
            System.out.println("Invalid action!You can use only numbers.Take it from the beginning.");
            System.exit(0);
        }
    }

    /**
     * read parameters from keyboard
     *
     * @param scan
     * @return
     */

    public static double readParam1(Scanner scan) {
        System.out.println("Enter first parameter:");
        String s = scan.next();
        Ac.allclear(s);
        closeCalculator(s);
        return Double.parseDouble(s);
    }

    public static double readParam2(Scanner scan) {
        System.out.println("Enter second parameter:");
        String s = scan.next();
        Ac.allclear(s);
        closeCalculator(s);
        return Double.parseDouble(s);
    }

    /**
     * read operator from keyboard
     *
     * @param scan
     * @return
     */
    public static String readOper(Scanner scan) {
        System.out.println("Select your operator from the following: +, -, *, /");
        String s = scan.next();
        Ac.allclear(s);
        closeCalculator(s);
        return s;
    }
}