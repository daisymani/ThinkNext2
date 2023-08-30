package com.example.package1;

class Student {
    String name;
    int age;

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


public class ParameterizedConstructor {

	public static void main(String[] args) {
		 Student student = new Student("Alice", 20);
	        student.display(); // Output: Name: Alice, Age: 20

	}

}
