/*
 * CodNumericPersonal
 */
package regex;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * CNP
 *
 * @author Doru
 */
public class CNP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String CNP;

        String CNPRegEx
                = "[1-2]"// first digit could be 1 or 2
                + "[0-9]{2}" // year of birth
                + "("
                + "(0[13578]|1[02])" // months with 31 days
                + "(0[1-9]|[12]\\d|3[01])" // 31 days
                + "|"
                + "(0[469]|11)" // months with 30 days
                + "(0[1-9]|[12]\\d|30)" // 30 days
                + "|"
                + "02" // month with 28 or 29 days
                + "(0[1-9]|[12]\\d)" // 29 days
                + ")"
                + "(0[1-9]|[1-3]\\d|4[0-6]|5[12])" // county - a value between 01-46, 51 or 52

                + "((00[1-9])|(0[1-9][0-9])|([1-9][0-9][0-9]))" // a number between 001 and 999

                + "[0-9]"; //random digit between 0-9

        System.out.println("Insert CNP");
        try {
            CNP = userInput.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("\nInvalid data!");
            CNP = "";
        }

        Pattern pattern = Pattern.compile(CNPRegEx);
        Matcher matcher = pattern.matcher(CNP);

        System.out.print("\n" + CNP);

        if (matcher.matches()) {
            System.out.println(" is a valid CNP");
        } else {
            System.out.println(" is not a valid CNP");
        }
    }
}
