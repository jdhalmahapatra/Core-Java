package DSA;

import java.util.Scanner;

public class ProductIntegers {

    /* This method returns the product of a and b using recursion */
    static int findProduct(int a, int b) {

        boolean isIntANegative = (a < 0)? true: false;
        boolean isIntBNegative = (b < 0)? true: false;
        boolean isResultNegative = isIntANegative ^ isIntBNegative;

        if(isIntANegative)
            a = Math.abs(a);
        if(isIntBNegative)
            b = Math.abs(b);

        // Write your code here
        if(b > 0){
            var sum = a + findProduct(a, b - 1);
            if(isResultNegative)
                sum = 0-sum;
            return sum;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

       /* If Math.abs(b) is greater than Math.abs(a), then find the product of b and
        a by passing b and a to 'findProduct' */
        if (Math.abs(b) > Math.abs(a)) {
            System.out.println(findProduct(b, a));
        } else {
            System.out.println(findProduct(a, b));
        }
    }
}
