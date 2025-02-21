package z_assignment1.university;

abstract class Person {
    String name;
    int age;
    String role;

    Person(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    abstract void displayInfo();
}
