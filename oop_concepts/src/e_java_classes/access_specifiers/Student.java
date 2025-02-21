package e_java_classes.access_specifiers;

class Student {
    public String name; // Public: Accessible everywhere
    protected int id;   // Protected: Accessible within the same package and subclasses
    int grade;          // Default: Accessible only within the same package
    private String email; // Private: Accessible only within this class

    // Constructor - Initialize
    public Student(String name, int id, int grade, String email) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.email = email;
    }

    public Student(){

    }

    // Public method to access private field
    public String getEmail() {
        return email; // Accessing private email
    }
}
