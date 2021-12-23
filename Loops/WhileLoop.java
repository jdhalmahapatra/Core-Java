package Loops;

/**
 * Odd numbers
 * Description
 * Write a program that prints all the odd numbers from 25 to 1 (in decreasing
 * order).
 * 
 * Input:
 * No input required
 * 
 * Output
 * 25 23 21 19 17 15 13 11 9 7 5 3 1
 */
public class WhileLoop {
    public static void main(String[] args) {
        int num = 25;
        while (num > 0) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
            num--;
        }
    }
}
