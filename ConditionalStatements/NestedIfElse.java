package ConditionalStatements;

import java.util.Scanner;

/**
 * Write a program to book movie tickets, if available
 * then check price. If price is > 400 then don't book else book
 * Assume ticket price is in whole number
 */
public class NestedIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isAvailable = input.nextBoolean();
        if (isAvailable) {
            System.out.println("Enter per ticket price: ");
            int price = input.nextInt();
            if (price > 400) {
                System.out.println("Don't book");
            } else {
                System.out.println("Booked");
            }
        } else {
            System.out.println("Tickets not available");
        }
        input.close();

    }
}
