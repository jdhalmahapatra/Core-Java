package DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
//        new PrimeNumbers().primeNumbers(19);
//        System.out.println("\n" + new PrimeNumbers().checkPrimeNUmbers(25));
//        new PrimeNumbers().printPrimeNumbers(33);
        System.out.println(new PrimeNumbers().primaryCheck(25));
    }

    //1
    void primeNumbers(int n){
        int count;
        for(int i = 2; i<=n; i++){
            count = 0;
            for(int j=i; j>=1; j--){
                if(i%j == 0)
                    count ++;
            }
            if(count == 2)
                System.out.print(" " + i);
        }
    }

    //2
    boolean checkPrimeNUmbers(int n){
        for(int i =2; i<= Math.sqrt(n);i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    void printPrimeNumbers(int n){
        for(int i=2; i<n; i++){
            if(checkPrimeNUmbers(i))
                System.out.print( " " +  i);
        }
    }

    //3
    boolean primaryCheck(int n){
        if(n <= 1)
            return false;
        if(n <= 3)
            return true;
        if(n%2 == 0 || n%3 == 0)
            return false;

        for(int i = 5; i<=Math.sqrt(n); i+= 6){
            if(n%i == 0 || n%(i+2) == 0)
                return false;
        }
        return true;
    }
}
