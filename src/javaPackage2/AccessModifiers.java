package javaPackage2;


//MyClass defines three instance variables (publicVar, privateVar, protectedVar) 
//with different access modifiers (public, private, protected).


class MyClass {
	
	//MyClass also defines three methods (publicMethod, privateMethod, protectedMethod) 
	//with different access modifiers.
	
    public int publicVar = 5;
    private int privateVar = 10;
    protected int protectedVar = 15;

    //public: Accessible from anywhere, including outside the class and in other packages.
    public void publicMethod() {
        System.out.println("This is a public method.");
  
    }

    //private: Accessible only within the same class
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    //protected: Accessible within the same class, subclasses 
    //(even if they are in different packages), and same package.
    
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
        
        MyClass myObject = new MyClass();
        System.out.println("Private variable: " + myObject.privateVar);
        myObject.privateMethod();
    }
    
    
}

//Note: Remember to use the appropriate access modifier based on your intended usage and encapsulation needs.

public class AccessModifiers {

	public static void main(String[] args) {
		 MyClass myObject = new MyClass();

	        System.out.println("Public variable: " + myObject.publicVar);
	        //System.out.println("Private variable: " + myObject.privateVar); // Error: Cannot access private variable
	        System.out.println("Protected variable: " + myObject.protectedVar);

	        myObject.publicMethod();
	       // myObject.privateMethod(); // Error: Cannot access private method
	        myObject.protectedMethod();

	}

}
