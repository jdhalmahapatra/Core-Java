package DSA;

public class ReverseInteger {
    static int ans = 0;
    public static void main(String[] args) {
        ReverseInteger obj = new ReverseInteger();
        System.out.println(obj.reverseInteger(492));
    }

    int reverseInteger(int n){
        if(n>0) {
            int rem = n % 10;
            ans = ans * 10 + rem;
            reverseInteger(n / 10);
        }
        return ans;
    }
}
