package DSA;

import java.util.Scanner;

public class PrintStartPattern {
    public static String func(int n) {
        //write your code here
        if(n <= 0)
            return "";

        String res=func(n-1);
        res=res+"*";
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        func(n);
    }
}
