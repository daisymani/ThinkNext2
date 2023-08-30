package k.com.day2.package1;


class Calculator {
    public int add(int a, int b) {
    	//int c=a+b;
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloading {
	
	 public static void main(String[] args) {
	        Calculator calculator = new Calculator();

	        int sum1 = calculator.add(5, 10);
	        double sum2 = calculator.add(3.5, 7.2);
	        int sum3 = calculator.add(2, 4, 6);

	        System.out.println("Sum 1: " + sum1);
	        System.out.println("Sum 2: " + sum2);
	        System.out.println("Sum 3: " + sum3);
	    }
}
