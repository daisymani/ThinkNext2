package k.com.day2.package1;

public class IllegalArgumentExceptionExample {

	public static void main(String[] args) {
        try {
            int age = -5;  // Negative age is not valid
            validateAge(age);
            System.out.println("Age is valid: " + age);
        } catch (IllegalArgumentException e) {
           System.out.println("An IllegalArgumentException occurred: " + e.getMessage());
        }
        
        System.out.println("Program continues...");
    }

    public static void validateAge(int age) {
        if (age < 0) {
           throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}
