package Loops;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            if (i == 5) {
                // Break Statement, it will come out of loop
                break;
            } else if (i > 8 && i < 11) {
                // Continue Statement, it will skip the following code
                continue;
            }
            System.out.println(i);
        }
    }
}
