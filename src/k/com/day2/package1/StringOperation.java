package k.com.day2.package1;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "First : Second : Third";
		String [] StringArray = str1.split(":");
		
		System.out.println(StringArray);
		
		for (String a : StringArray)
			System.out.println(a);
		
	}

}
