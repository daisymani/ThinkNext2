package k.com.day2.package2;

//#**********************************************************************************************************************************
//
//Java encapsulation is one of the fundamental principles of object-oriented programming (OOP). It refers to the practice of hiding 
//the internal details of an object and providing controlled access to its state (fields) and behavior (methods) through well-defined
//interfaces. Encapsulation helps in maintaining the integrity and consistency of an object's data and behavior, while also providing
//a level of abstraction that simplifies how the object is used by other parts of the program.
//
// Key Concepts: Private Access Modifiers, Public Access Modifiers
// Private Access Modifiers::
//Fields and methods can be marked as private, which means they can only be accessed within the same class. This restricts external 
//access and provides data hiding.
//
//Public Access Modifiers::
//You expose specific methods (often referred to as getters and setters) that allow controlled access to the private fields. These 
//methods provide a way to read and modify the private fields while maintaining encapsulation.
//
class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
}

public class Encapsulation {
	
	public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alice");
        student.setAge(20);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }

}


//In this example, the Student class encapsulates its fields name and age using private access modifiers. Public getter 
//and setter methods (getName(), setName(), getAge(), setAge()) provide controlled access to these fields. The setAge() 
//method ensures that only valid ages are set.

//Encapsulation helps in maintaining a clean interface for interacting with objects, making it easier to change the internal
//implementation without affecting the external code. It also improves security and helps prevent unintended manipulation of
//object state.
