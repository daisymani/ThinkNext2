package k.com.day2.package2;

class Animal1 {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class AnimalCat_1 extends Animal {
    AnimalCat_1(String species) {
		super(species);
		// TODO Auto-generated constructor stub
	}

	void purr() {
        System.out.println("Cat is purring");
    }
}

public class ExtendsKeyword {
	
	public static void main(String[] args) {
		AnimalCat_1 myCat = new AnimalCat_1("cat");
        myCat.makeSound();  // Output: Animal makes a sound
        myCat.purr();       // Output: Cat is purring
    }

}
