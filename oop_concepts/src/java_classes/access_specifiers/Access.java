package java_classes.access_specifiers;

import java.util.Scanner;

public class Access {
    public int publicVar;
    protected int protectedVar;
    int defaultVar; // default access
    private int privateVar;

    public void publicMethod() {
        // Accessible everywhere
    }

    protected void protectedMethod() {
        // Accessible within the same package and by subclasses
    }

    void defaultMethod() {
        // Accessible only within the same package
    }

    private static void privateMethod() {
        // Accessible only within this class
    }

    public static void main(String[] args) {
        Access a = new Access();
        a.publicMethod();

        Scanner sc = new Scanner(System.in);
        sc.hasNextInt();
    }
}
