package firsJavaPackage;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		//whileLoop();
		//while2Loop();
		//DoWhileLoop();
		//forLoop();
		//switchPgm();
		//DoWhileContinue();
		ContinueStatement();

	}

	//WhileLoop
	public static void whileLoop() {
		int input1 = 0;
		int count =0;
		while ( input1<=15 ) {
		  count = count+1;
			System.out.println("TestWhileLoop");
			input1++;
			System.out.println(input1);	
		}
		
		System.out.println("final count" + count);
	}
	
	//WhileLoop
	public static void while2Loop() {
		int input1 = 0;
		while ( input1<15 ) {
		
			System.out.println("While2Test");
			input1++;
			System.out.println(input1);	
			
			while ( input1==14 ) {
				System.out.println("CurrentValue is 14");
				System.out.println(input1);	
				break;
			}
			
		}
	}
	
	//DoWhileLoop
	public static void DoWhileLoop() {
		
		int input2 = 0;
		int counter2=0;
		
		do{
			System.out.println("TestDoWhile");
			input2++;
			counter2++;
			System.out.println(input2);
			
		}while (input2<=15);
		
		System.out.println("Do While Final Count : " + counter2);
	}
	
	//forLoop
    public static void forLoop() {
    	for (int j=0; j<=5; j++) {
    		System.out.println(j);
    	}
    }
    
    public static void switchPgm() {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	String DayoftheWeek;
    	
    	int Day = scanner.nextInt();
    	
    	switch (Day) {
    		case 1:
    			DayoftheWeek ="Sunday";
    			break;
    			
    		case 2: 
    			DayoftheWeek = "Monday";
    			break;
    		case 3: 
    			DayoftheWeek = "Tuesday";
    			break;	
    		case 4: 
    			DayoftheWeek = "Wednesday";
    			break;
    		case 5: 
    			DayoftheWeek = "Thursday";
    			break;
    		case 6: 
    			DayoftheWeek = "Friday";
    			break;
    		case 7: 
    			DayoftheWeek = "Saturday";
    			break;
    		default:
    			DayoftheWeek = "Invalid Day";
    	}
    	
    	System.out.println("Day of the week is : " + DayoftheWeek);
    	scanner.close();
    
    }
    
    
    public static void switchPgm1() {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	String Dayofthe_Week1 = null;
    	
    	int Day = scanner.nextInt();
    	
    	switch (Day) {
    		case 1:
    			
    			Loops.Day1();
    			break;
    			
    		case 2: 
    			Dayofthe_Week1 = "Monday";
    			break;
    		case 3: 
    			Dayofthe_Week1 = "Tuesday";
    			break;	
    		case 4: 
    			Dayofthe_Week1 = "Wednesday";
    			break;
    		case 5: 
    			Dayofthe_Week1 = "Thursday";
    			break;
    		case 6: 
    			Dayofthe_Week1 = "Friday";
    			break;
    		case 7: 
    			Dayofthe_Week1 = "Saturday";
    			break;
    		default:
    			Dayofthe_Week1 = "Invalid Day";
    	}
    	
    	System.out.println("Day of the week is : " + Dayofthe_Week1);
    	scanner.close();
    
    }
    
    public static String Day1() {
    	return "Sunday";
    }
    
    
    //Do While with a continue
    
    public static void DoWhileContinue() {
    	 Scanner scanner2 = new Scanner(System.in);
         int number;

         do {
             System.out.print("Enter a positive number (or -1 to exit): ");
             number = scanner2.nextInt();

             if (number == -1) {
                 System.out.println("Exiting the loop.");
                continue; // Skip the remaining code in the loop and start the next iteration
             }

             System.out.println("Squared value: " + (number * number));
         } while (number >= 0);

         System.out.println("Loop finished.");
         scanner2.close();
         
         System.out.println("This will skipt the remaining code in the loop and would continue executing the rest");
    }
	
    
    public static void ContinueStatement() {
        System.out.println("Even numbers between 1 and 10:");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue; // Skip odd numbers
            	//break;
            }
            System.out.println(i);
            System.out.println("Statement inside th loop");
        }
        System.out.println("Statement outside th loop");
    }
	
}
