package z_assignment1.animals;

class Dog extends Animal implements Pet {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks!");
    }

    @Override
    public void playWithOwner() {
        System.out.println(name + " is playing with the owner!");
    }
}
