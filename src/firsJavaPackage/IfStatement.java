package firsJavaPackage;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int input1 = 10;
      int input2 = 20;
      
      int val = input1+input2;
      System.out.println(val);
      
      if (val<=15) { 
    	  System.out.println("Value is less than or equal to 15");
      }else if (val > 15 && val < 20) {
    	  System.out.println("Value is greater than 15");
      }else {
    	  System.out.println("Value is neutral");
      }
      
      nestedIfMethod();
	}
	
	// new method to create nestedIF
	public static void nestedIfMethod() {
		
		String strVal = "JavaSession1";
		int intVal1= 5;
		int intVal2 = 5;
		
		if (intVal1 == 5) {
			
			System.out.println("Entering the first IF");
			
			if (strVal == "JavaSession" && intVal2 ==5) {
				System.out.println("Entering the secibd IF");
			}else {
				System.out.println("Atleast one value is not valid");
			}
		} else {
			System.out.println("Input Values does not match a valid condition, hence didn not enter if");
		}
		
		
		
	}
	
	

}
