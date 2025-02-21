package e_java_classes.static_non_static;

public class Main {
    public static void main(String[] args) {
        // Accessing static member without creating an object
        System.out.println("Static Access: " + Student.university);

        // Creating objects
        Student student1 = new Student("Jane");
        Student student2 = new Student("John");

        // Accessing non-static members
        student1.displayInfo();
        student2.displayInfo();

        // Accessing static method
        Student.displayUniversity();
    }
}
