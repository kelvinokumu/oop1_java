package z_assignment1.animals;

class Cat extends Animal implements Pet {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " meows!");
    }

    @Override
    public void playWithOwner() {
        System.out.println(name + " is playing with the owner!");
    }
}
