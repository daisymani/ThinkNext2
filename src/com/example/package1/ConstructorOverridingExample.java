package com.example.package1;


//Later classes - Not on day 2

class Animal {
    String type;

    // Superclass constructor
    public Animal(String type) {

        this.type = type;
    }
}

class Dog extends Animal {
    String breed;

    // Subclass constructor
    public Dog(String type, String breed) {
        super(type); // Calling the superclass constructor using 'super'
        this.breed = breed;
    }

    public void displayInfo() {
        System.out.println("Type: " + type + ", Breed: " + breed);
    }
}


public class ConstructorOverridingExample {
	public static void main(String[] args) {
        Dog myDog = new Dog("Mammal", "Golden Retriever");
        myDog.displayInfo(); // Output: Type: Mammal, Breed: Golden Retriever
    }
	

}
