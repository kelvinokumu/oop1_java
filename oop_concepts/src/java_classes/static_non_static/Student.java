package java_classes.static_non_static;

class Student {
    public String name; // Non-static: belongs to each Student instance
    public static String university = "ABC University"; // Static: shared by all students

    // Constructor
    public Student(String name) {
        this.name = name;
    }

    // Non-static method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("University: " + university); // Static can be accessed in non-static context
    }

    // Static method
    public static void displayUniversity() {
        System.out.println("University: " + university);
        // System.out.println("Name: " + name); // Error: Cannot access non-static members in static context
    }
}


