package com.example.package1;

//Constructor overloading in Java allows you to define multiple constructors in a class, each with 
//a different set of parameters. This provides flexibility when creating objects, as you can choose 
//the appropriate constructor based on the data you have available.

class Studentx {
    String name;
    int age;
    double gpa;

    // Constructor with no parameters
    public Studentx() {
        name = "Unknown";
        age = 0;
        gpa = 0.0;
    }

    // Constructor with name parameter
    public Studentx(String studentName) {
        name = studentName;
        age = 0;
        gpa = 0.0;
    }

    // Constructor with name, age, and GPA parameters
    public Studentx(String studentName, int studentAge, double studentGPA) {
        name = studentName;
        age = studentAge;
        gpa = studentGPA;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", GPA: " + gpa);
    }
}


public class JavaConstructorOverloading {
	
	public static void main(String[] args) {
        //Studentx student1 = new Studentx();
        Studentx student2 = new Studentx("Alice");
        Studentx student3 = new Studentx("Bob", 20, 3.75);

        //student1.display(); // Output: Name: Unknown, Age: 0, GPA: 0.0
        student2.display(); // Output: Name: Alice, Age: 0, GPA: 0.0
        student3.display(); // Output: Name: Bob, Age: 20, GPA: 3.75
    }

}

