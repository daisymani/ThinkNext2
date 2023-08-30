package com.example.package1;

class person {
	
	//global variables
	String G_Var1_Name ;
	String G_Var2_Empid;
	
	public person(){
		G_Var1_Name="Daisy";
		G_Var2_Empid="2213";
	}
	
	public void display() {
		System.out.println("display Name : " + G_Var1_Name);
		System.out.println("display Name : " + G_Var2_Empid);
	}
	
}


public class Constructor_Example {
	
	
	public static void main(String[] args) {
		
		person PERSON = new person();
		PERSON.display();
		
		
	}

}
