package DSA;

import java.sql.Time;

public class TimeComplexity {
    public static void main(String[] args) {
        TimeComplexity obj = new TimeComplexity();
        obj.function();
    }
    int i = 1;
    int function() {
        if (i <= 5) {
            System.out.print(i++ + " ");
            System.out.println(i);
            function();
        }
        return 0;
    }
}
