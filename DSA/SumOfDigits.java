package DSA;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
    public static int sum(int n) {
        //write the logic here
        int a = n%10;
        return n> 0? a + sum(n/10): a;
    }
}
