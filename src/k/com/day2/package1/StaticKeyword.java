package k.com.day2.package1;

public class StaticKeyword {
	
	static int staticVariable = 10;

    public static void main(String[] args) {
    	StaticKeyword obj1 = new StaticKeyword();
    	StaticKeyword obj2 = new StaticKeyword();

        obj1.staticVariable = 30;

        System.out.println(obj1.staticVariable);  // Output: 20
        System.out.println(obj2.staticVariable);  // Output: 20
    }

}


