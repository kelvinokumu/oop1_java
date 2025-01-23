package java_classes.access_specifiers;

class Lecturer {
    public void displayStudentDetails() {
        Student student = new Student("John Doe", 101, 85, "john@example.com");

        System.out.println("Name: " + student.name);  // Public: Accessible
        System.out.println("ID: " + student.id);      // Protected: Accessible (same package)
        System.out.println("Grade: " + student.grade); // Default: Accessible (same package)
        // System.out.println("Email: " + student.email); // Error: Private, cannot be accessed
        System.out.println("Email: " + student.getEmail()); // Accessing private email via public method
    }
}
