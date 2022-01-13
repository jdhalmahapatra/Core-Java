package DSA;

import java.util.Scanner;

public class TwoPeopleMetEachOther {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int p1 = s.nextInt();
        int p2 = s.nextInt();
        int s1 = s.nextInt();
        int s2 = s.nextInt();
        twoPeopleMeet(p1, p2, s1, s2);
    }

    // Method to find whether two people meet after jumping for the same number of times
    static void twoPeopleMeet(int p1, int p2, int s1, int s2) {
        // Write your code here
        if(p1 == p2 && s1 == s2)
            System.out.print("YES");
        else if(p1>p2 && s1>s2)
            System.out.print("NO");
        else if(p1<p2 && s1<s2)
            System.out.print("NO");
        else{
            int diffDistance = (p1>p2)? p1-p2 : p2-p1;
            int diffSpeed = (s1>s2)? s1-s2 : s2-s1;
            if(diffDistance%diffSpeed == 0)
                System.out.print("YES");
            else
                System.out.print("NO");
        }

    }
}
