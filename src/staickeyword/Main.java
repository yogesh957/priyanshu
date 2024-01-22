package staickeyword;

class StaticExample {
    // Static variable
    static int staticVariable = 10;
    int nonStaticVariable = 5;

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
        // You cannot call non-static methods directly from a static method.
        // Uncommenting the following line will result in a compilation error.
        // nonStaticMethod();
    }

    // Non-static method
    void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    // Static block
    static {
        System.out.println("Static block in StaticExample class.");
    }
}

class AnotherClass {
    // Static block
    static {
        System.out.println("Static block in AnotherClass.");
    }
}
public class Main {
    // Static block
    static {
        System.out.println("Static block in Main class.");
    }
    public static void main(String[] args) {
        // Calling static method and accessing static variable
        StaticExample.staticMethod();
        System.out.println("Static variable: " + StaticExample.staticVariable);

        // Creating an object to access non-static method and variable
        StaticExample obj = new StaticExample();
        obj.nonStaticMethod();
        System.out.println("Non-static variable: " + obj.nonStaticVariable);
    }
}