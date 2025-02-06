package java_classes.access_specifiers;

class Lecturer {
    public void displayStudentDetails() {
        Student student = new Student("John Doe", 101, 85, "john@example.com");

        System.out.println("Name: " + student.name);  // Public: Accessible
        System.out.println("ID: " + student.id);      // Protected: Accessible (if same package)
        System.out.println("Grade: " + student.grade); // Default: Accessible (if same package)
        // System.out.println("Email: " + student.email); // Error: Private, cannot be accessed
        System.out.println("Email: " + student.getEmail()); // Accessing private email via public method

        Student student1 = new Student();
    }

    public static void mains(String[] args) {
        Lecturer lec = new Lecturer();
                lec.displayStudentDetails();
    }

    public static void displayStudentDetail() {
        Student student = new Student("John Doe", 101, 85, "john@example.com");

        System.out.println("Name: " + student.name);  // Public: Accessible
        System.out.println("ID: " + student.id);      // Protected: Accessible (if same package)
        System.out.println("Grade: " + student.grade); // Default: Accessible (if same package)
        // System.out.println("Email: " + student.email); // Error: Private, cannot be accessed
        System.out.println("Email: " + student.getEmail()); // Accessing private email via public method

        Student student1 = new Student();
    }
    public static void main(String[] args) {
        Lecturer.displayStudentDetail();
    }



}
