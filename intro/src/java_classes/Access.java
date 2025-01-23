package java_classes;

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

    private void privateMethod() {
        // Accessible only within this class
    }
}
