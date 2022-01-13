package NonStaticMembers;

public class NonStaticMembersDemo {
    int num; //Non-Static Variables

    //Constructor
    NonStaticMembersDemo(){
        System.out.println("Inside the constructor");
    }

    //Non-static block
    {
        System.out.println("Inside Non-Static block");
    }

    public static void main(String[] args) {
        System.out.println("Inside a main method");
        new NonStaticMembersDemo();
        new NonStaticMembersDemo();
        new NonStaticMembersDemo();
    }
    static {
        System.out.println("Inside static block");
        main(new String[]{});
    }
}
