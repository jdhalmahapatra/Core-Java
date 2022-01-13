package DSA;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {
    public static void main(String[] args) {
        //#2: Algorithm 2 Call
        int fibonacciNumbers = calculateFibonacciSequenceUsingRecursion(40);
        System.out.println("Algorithm 2: " + fibonacciNumbers);

//        //#3: Algorithm 3 Call
//        int value = fibonacciSeries(10);
//        System.out.println("Fibonacci Series: " + value);

//        int res = fibonacciSeq(10);
//        System.out.println("\n" + res);
    }

    //#2: Algorithm 2
    static int calculateFibonacciSequenceUsingRecursion(int n) {
        if(n == 0)
            return 0;
        else if(n < 2)
            return 1;
        else
            return (calculateFibonacciSequenceUsingRecursion(n-1) + calculateFibonacciSequenceUsingRecursion(n-2));
    }

    static int fibonacciSeries(int n){
        int a = 0, b= 1, c = n;
        for(int i=2; i<=n; i++){
            c = (a+b);
            a = b;
            b = c;
        }
        return c;
    }

    static  int fibonacciSeq(int n){
        int[] a = new int[n+1];
        a[0] = 0;
        a[1] = 1;
        int finalValue =0;
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else{
            for(int i=2; i<n; i++){
                a[i] = a[i-1] + a[i-2];
                finalValue = a[i];
                System.out.print(" " + a[i]);
            }
        }
        return finalValue;
    }
}
