package ConditionalStatements;

import java.util.Scanner;

/**
 * -----SignOfANumber-----
 * 
 * Write a Java program to determine whether a number entered by a user is
 * positive or negative. (Assume that the user will enter a non-zero integer).
 * 
 * 1) Print out "The number entered is negative" if the number entered is
 * negative
 * 
 * 2) Print out "The number entered is positive" if the entered number if
 * positive
 * 
 * Sample Input:
 * 
 * -1
 * 
 * Sample Output:
 * 
 * The number entered is negative
 * 
 * We are going to use Scanner to input the number in Console
 */
public class SignOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("Enter a non-zero number: ");
        number = input.nextInt();

        if (number > 0) {
            System.out.println("The number entered is positive");
        } else {
            System.out.println("The number entered is negative");
        }
        input.close();
    }

}