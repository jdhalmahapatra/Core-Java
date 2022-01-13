package StaticMembers;

//Static Block execute first even before the main method.
//Anything we would like to execute or initialize before the main method we do it in Static Block
//Especially if we would like to connect to any server, system or Database server before main execute we do it in static block.
public class StaticBlock {
    public static void main(String[] args){
        System.out.println("I am from main method");
    }
    //Static block
    static {
        System.out.println("I am from static block");
    }


}
