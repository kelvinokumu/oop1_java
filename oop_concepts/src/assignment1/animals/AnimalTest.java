package assignment1.animals;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Kitty");
        Lion lion = new Lion("Simba");

        dog.makeSound();
        cat.makeSound();
        lion.makeSound();

        dog.playWithOwner();
        cat.playWithOwner();
    }
}
