package NonStaticMembers;

//Here we will learn Static Reference directly of a class
//We can do it in two ways
//  1. Inside Static block
//  2. Inside Static Method
public class Demo {
    static Demo obj;
    static {
        System.out.println(Demo.obj);
        Demo.obj = new Demo();
        Demo.init();
    }

    public static void main(String[] args) {
        System.out.println(Demo.obj);
    }
    static void init(){
        Demo.obj = new Demo();
    }
}
