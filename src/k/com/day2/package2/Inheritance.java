package k.com.day2.package2;


//The Animal class is the superclass with a species field and methods makeSound() and displaySpecies()
class Animal {
    String species;

    Animal(String species) {
        this.species = species;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }

    void displaySpecies() {
        System.out.println("Species: " + species);
    }
}

//The Cat class and Dog class are subclasses that inherit from the Animal class.
//The super() keyword is used in the constructors of the subclasses to call the constructor of the superclass and set the species.
//The @Override annotation indicates that the makeSound() method in the subclasses is overriding the same method in the superclass
class Cat extends Animal {
    Cat() {
        super("Cat");
    }

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Dog extends Animal {
    Dog() {
        super("Dog");
    }

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}


public class Inheritance {
	
	public static void main(String[] args) {
        Cat myCat = new Cat();
        Dog myDog = new Dog();

        myCat.displaySpecies(); // Output: Species: Cat
        myCat.makeSound();      // Output: Cat meows

        myDog.displaySpecies(); // Output: Species: Dog
        myDog.makeSound();      // Output: Dog barks
    }

}
