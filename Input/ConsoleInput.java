package Input;

import java.util.Scanner;

/**
 * For Console input we use Scanner in Java.
 * Scanner class can be found under 'java.utils.Scanner'
 */

public class ConsoleInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // For String value input from Console
        System.out.println("Enter a String");
        String s = input.nextLine();
        System.out.println("The value of s is " + s);

        // For Integer value input from Console
        int n;
        System.out.println("Enter an integer value: ");

        n = input.nextInt();
        System.out.println("The value of n is " + n);

        // For Double value input from Console
        Double d;
        System.out.println("Enter a Double value: ");
        d = input.nextDouble();
        System.out.println("The value of d is " + d);

        // For Float value input from Console
        Float f;
        System.out.println("Enter a Float value: ");
        f = input.nextFloat();
        System.out.println("The value of d is " + f);

        input.close();
    }
}
