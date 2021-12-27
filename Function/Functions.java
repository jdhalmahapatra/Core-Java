package Function;

/**
 * We are discussing here User Defined Methods
 * They are basically 4 types:
 * a. void <methodName> ()
 * b. void <methodName> (params)
 * c. returnType <methodName> ()
 * d. returnType <methodName> (params)
 */
public class Functions {
    public static void main(String[] args) {
        printName();
        printName("Jyotiraditya");
        System.out.println(getMyName());
        System.out.println(getMyName("Jyotiraditya Dhalmahapatra"));
    }

    // void <methodName> ()
    static void printName() {
        System.out.println("Jyotiraditya");
    }

    // void <methodName> (params)
    static void printName(String name) {
        System.out.println("My Name is " + name);
    }

    // returnType <methodName> ()
    static String getMyName() {
        return "My Name is Jyotiraditya Dhalmahapatra";
    }

    // returnType <methodName> (params)
    static String getMyName(String name) {
        return "My Name is " + name;
    }
}
