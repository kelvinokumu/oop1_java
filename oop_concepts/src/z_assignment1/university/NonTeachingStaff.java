package z_assignment1.university;

class NonTeachingStaff extends Person implements Responsibilities {
    String department;

    NonTeachingStaff(String name, int age, String department) {
        super(name, age, "Non-Teaching Staff");
        this.department = department;
    }

    @Override
    void displayInfo() {
        System.out.println(role + ": " + name + ", Age: " + age + ", Department: " + department);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is handling administrative work in " + department + ".");
    }
}
