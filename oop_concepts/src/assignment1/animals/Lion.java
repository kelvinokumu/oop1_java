package assignment1.animals;

class Lion extends Animal {
    Lion(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " roars!");
    }
}
