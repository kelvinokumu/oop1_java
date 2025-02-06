package assignment1.university;

class Student extends Person {
    String course;

    Student(String name, int age, String course) {
        super(name, age, "Student");
        this.course = course;
    }

    @Override
    void displayInfo() {
        System.out.println(role + ": " + name + ", Age: " + age + ", Course: " + course);
    }
}
