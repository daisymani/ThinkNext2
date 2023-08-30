package k.com.day4.package1;

//In this example, the Student class is composed of a Department object, 
//  representing the relationship between a student and the department they
//  belong to. This composition allows us to associate a student with a 
//  specific department. The Student class doesn't manage the department's 
//  details directly; it delegates that responsibility
//  to the Department class.
//
//The concept of composition is demonstrated by how the Student class contains a reference to a 
// Department object,creating a "has-a" relationship between them. This approach encapsulates 
// related functionality within the relevant classes, promoting modularity and maintainability.

// Department class representing a department in a university
//Has-a relationship - Delegation

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("Entered Student class to get name");
        return name;

    }
}

// Student class representing a student in a university
class Student {
    private String name;
    private int rollNumber;
    private Department department; // Composition: Student has a Department

    public Student(String name, int rollNumber, Department department) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public Department getDepartment () {
        System.out.println("Entered Student class to get department");
        return department;

    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        // Create a Department
        Department computerScience = new Department("Computer Science");

        // Create a Student and associate with the Department
        Student student1 = new Student("Alice", 101, computerScience);

        // Display student information
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Roll Number: " + student1.getRollNumber());
        System.out.println("Department: " + student1.getDepartment().getName());
    }
}
