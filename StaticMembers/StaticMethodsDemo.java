package StaticMembers;

public class StaticMethodsDemo {
    public static void main(String[] args){
        System.out.println("Inside Main");
        StaticMethodsDemo.showMyName();
    }

    static void showMyName(){
        System.out.println("Jyotiraditya");
    }
    static {
        //main(new String[]{});
        System.out.println("Inside Static Block");
    }
}

