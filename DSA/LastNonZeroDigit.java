package DSA;

import java.util.*;

public class LastNonZeroDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(lastNonZeroDigit(n));
    }

    // Method to find the last digit of n!
    static int lastNonZeroDigit(int n) {
        // Write your code here
        //Find the Factorial
        List<Integer> numValue = new ArrayList<Integer>();
        int factorialValue = factorial(n);
        while (factorialValue > 0){
            int rem = factorialValue%10;
            numValue.add(rem);
            factorialValue = factorialValue/10;
        }
        Collections.reverse(numValue);
        while (numValue.contains(0)){
            int index = numValue.indexOf(0);
            numValue.remove(index);
        }
        return numValue.get(numValue.size()-1);
    }
    static int factorial(int n){
        if (n == 0)
            return 1;

        return n * factorial(n-1);
    }
}
