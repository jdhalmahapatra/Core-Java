package Loops;

import java.util.Scanner;

/**
 * Write a Java program to count the number of digits in a number entered by the
 * user.
 * 
 * Hint: You can use the "/" operator here.
 * 
 * 
 * 
 * Sample Input:
 * 
 * 123455
 * 
 * Sample Output:
 * 
 * It is a 6 digits number
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        int counter = 0;
        do {
            n = n / 10;
            counter++;
        } while (n != 0);
        System.out.println("It is a " + counter + " digit(s) number");
        input.close();
    }
}
