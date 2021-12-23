package ConditionalStatements;

import java.util.Scanner;

/**
 * -------OddOrEven-------
 * Write a Java program to determine if a number entered by the user is odd or
 * even.(Assume that the user will enter a positive integer only).
 * 
 * 1) Print out "The number entered is even" if the number entered is even
 * 
 * 2) Print out "The number entered is odd" if the entered number if odd
 * 
 * 
 * 
 * Sample Input:
 * 
 * 2
 * 
 * Sample Output:
 * 
 * The number entered is even
 */
public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a non-negative and non-zero number");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number entered is even");
        } else {
            System.out.println("The number entered is odd");
        }
        input.close();
    }
}
