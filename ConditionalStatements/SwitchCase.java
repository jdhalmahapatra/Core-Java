package ConditionalStatements;

import java.util.Scanner;

/**
 * --------SwitchCase------
 * 
 * Sorting Hat
 * Write Java code using Switch case statements for the following problem:
 * 
 * You have to create a sorting hat program. A student will be asked to enter a
 * random number and based on that, he/she will be allotted a house. The
 * allotment is as follows:
 * 1-Hufflepuff
 * 2-Gryffindor
 * 3-Slytherin
 * 4-Ravenclaw
 * Make the default statement as “Enter a number from 1 to 4”Sample input:
 * 1
 * Sample output:
 * Hufflepuff
 */
public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Enter a number from 1 to 4");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        switch (n) {
            case 1:
                System.out.println("Hufflepuff");
                break;
            case 2:
                System.out.println("Gryffindor");
                break;
            case 3:
                System.out.println("Slytherin");
                break;
            case 4:
                System.out.println("Ravenclaw");
                break;
            default:
                System.out.println("Please enter a number with in 1 to 4");
                break;
        }
        input.close();
    }

}