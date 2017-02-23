/*
 * file for my first self made program in Java
 */
package myfirstselfmadeprograminjava;

/**
 * My first self made program in Java
 *
 * @author Doru
 */
import java.util.Scanner;

public class MyFirstSelfMadeProgramInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter your name: ");// Allows a person to enter his/her name 
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);//The program read the line of introduced characters 
    }

}
