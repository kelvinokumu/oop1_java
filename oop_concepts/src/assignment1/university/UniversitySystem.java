package assignment1.university;

public class UniversitySystem {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, "Computer Science");
        Lecturer lecturer = new Lecturer("Dr. John", 45, "Artificial Intelligence");
        NonTeachingStaff staff = new NonTeachingStaff("Mr. Smith", 50, "Finance");

        student.displayInfo();
        lecturer.displayInfo();
        lecturer.performDuties();
        staff.displayInfo();
        staff.performDuties();
    }
}
