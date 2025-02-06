package assignment1.university;

class Lecturer extends Person implements Responsibilities {
    String subject;

    Lecturer(String name, int age, String subject) {
        super(name, age, "Lecturer");
        this.subject = subject;
    }

    @Override
    void displayInfo() {
        System.out.println(role + ": " + name + ", Age: " + age + ", Teaches: " + subject);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing lecture materials.");
    }
}
