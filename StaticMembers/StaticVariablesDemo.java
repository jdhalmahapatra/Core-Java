package StaticMembers;

public class StaticVariablesDemo {
    static int num=5;
    public static void main(String[] args) {
        System.out.println(StaticVariablesDemo.num);
        StaticVariablesDemo.num = 10;
        System.out.println(StaticVariablesDemo.num);
    }
}
