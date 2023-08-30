package k.com.day3.package1;

public class JavaStringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    LengthString();
		CharacterIndex();
		ConcatenateStrings();
		StringEquality();
		EqualIgnoreCase();
		StringUpperCase();
		
		SubstringMtd();
		SubstringRange();
		
		StringReplace();
		StringReplaceAll();
		
		StringStartsWith();
		StringEndsWith();
		ContainsCharSequence();
		IsStringEmpty();
		TrimFunc();
		SplitString();
		StringValueOf();
	}
	
	//length(): Returns the length of the string.
	
	public static void LengthString() {
		String str = "Think Next!";
		int length = str.length(); // length = 13
		System.out.println(length);
	}
	
	//charAt(int index): Returns the character at the specified index.  
	public static void CharacterIndex() {
		String str = "Java";
		char ch = str.charAt(1); // ch = 'a'
		System.out.println(ch);
	}
	
	//concat(String str): Concatenates two strings.
	public static void ConcatenateStrings() {
		String str1 = "Think";
		String str2 = "Next";
		String result = str1.concat(str2); // result = "HelloWorld"
		System.out.println(result);
	}
	
	//equals(Object obj): Compares the contents of two strings for equality.
	public static void StringEquality() {
		String str1 = "Think";
		String str2 = "Think";
		boolean isEqual = str1.equals(str2); // isEqual = false
		System.out.println(isEqual);
	}
	
	//equalsIgnoreCase(String str): Compares two strings ignoring case.
	
	public static void EqualIgnoreCase() {
		String str1 = "Java";
		String str2 = "java";
		boolean isEqual = str1.equalsIgnoreCase(str2); // isEqual = true
		System.out.println(isEqual);
	}
	
	//toUpperCase(): Converts the string to uppercase.
	public static void StringUpperCase() {
		String str = "java";
		String upperCaseStr = str.toUpperCase(); // upperCaseStr = "JAVA"
		System.out.println(upperCaseStr);
	}
	
	//toLowerCase(): Converts the string to lowercase.
	public static void StringLowerCase() {
		String str = "Java";
		String lowerCaseStr = str.toLowerCase(); // lowerCaseStr = "java"
		System.out.println(lowerCaseStr);
	}
	
	//substring(int beginIndex): Returns a substring starting from the specified index
	public static void SubstringMtd() {
		String str = "Hello, World!";
		String subStr = str.substring(7); // subStr = "World!"
		System.out.println(subStr);
		
	}
	
	//substring(int beginIndex, int endIndex): Returns a substring within the specified range.
	public static void SubstringRange() {
		String str = "Hello, World!";
		String subStr = str.substring(7, 12); // subStr = "World"
		System.out.println(subStr);
	}
	
	//replace(char oldChar, char newChar): Replaces occurrences of a character with another character.
	
	public static void StringReplace() {
		String str = "Hello, World!";
		String newStr = str.replace('o', 'x'); // newStr = "Hellx, Wxrld!"
		System.out.println(newStr);
	}
	
	//replaceAll(String regex, String replacement): Replaces substrings that match a regular expression with a new string.
	public static void StringReplaceAll() {
		String str = "Java is great!";
		String newStr = str.replaceAll("is", "will be"); // newStr = "Java will be great!"
		System.out.println(newStr);
	}

	//startsWith(String prefix): Checks if the string starts with the given prefix.
	public static void StringStartsWith() {
		String str = "Hello, World!";
		boolean startsWithHello = str.startsWith("Hello"); // startsWithHello = true
		System.out.println(startsWithHello);
	}
	
	//endsWith(String suffix): Checks if the string ends with the given suffix.
	public static void StringEndsWith() {
		String str = "Hello, World!";
		boolean endsWithWorld = str.endsWith("World!"); // endsWithWorld = true
		System.out.println(endsWithWorld);
	}
	
	//contains(CharSequence sequence): Checks if the string contains the given sequence.
	public static void ContainsCharSequence() {
		String str = "Java programming";
		boolean containsJava = str.contains("Java"); // containsJava = true
		System.out.println(containsJava);
	}
	//isEmpty(): Checks if the string is empty.
	public static void IsStringEmpty() {
		String str = "";
		boolean isEmpty = str.isEmpty(); // isEmpty = true
		System.out.println(isEmpty);
	}
	
	//trim(): Removes leading and trailing whitespace.
	public static void TrimFunc() {
		String str = "   Java Programming   ";
		String trimmedStr = str.trim(); // trimmedStr = "Java Programming"
		System.out.println(trimmedStr);
	}
	
	//split(String regex): Splits the string into an array of substrings using the given regular expression.
	public static void SplitString() {
		String str = "apple,banana,orange";
		String[] fruits = str.split(",");  // fruits = ["apple", "banana", "orange"]
		System.out.println(fruits);
	}
	
	//valueOf(any value): Converts different data types to their string representation.
	public static void StringValueOf() {
		int number = 42;
		String strNumber = String.valueOf(number); // strNumber = "42"
		System.out.println(strNumber);
	}
	
	
}



//
//comprehensive list of commonly used methods available in the Java String class:
//
//charAt(int index): Returns the character at the specified index.
//codePointAt(int index): Returns the Unicode code point of the character at the specified index.
//codePointBefore(int index): Returns the Unicode code point before the character at the specified index.
//codePointCount(int beginIndex, int endIndex): Returns the number of Unicode code points between the specified indexes.
//compareTo(String anotherString): Compares two strings lexicographically.
//compareToIgnoreCase(String anotherString): Compares two strings lexicographically, ignoring case.
//concat(String str): Concatenates two strings.
//contains(CharSequence sequence): Checks if the string contains the given sequence.
//contentEquals(CharSequence cs): Checks if the content of the string is equal to the specified CharSequence.
//contentEquals(StringBuffer sb): Checks if the content of the string is equal to the specified StringBuffer.
//endsWith(String suffix): Checks if the string ends with the given suffix.
//equals(Object anObject): Compares the contents of two strings for equality.
//equalsIgnoreCase(String anotherString): Compares two strings for equality, ignoring case.
//getBytes(): Converts the string to a byte array using the platform's default charset.
//getBytes(Charset charset): Converts the string to a byte array using the specified charset.
//getBytes(String charsetName): Converts the string to a byte array using the specified charset.
//hashCode(): Returns a hash code for the string.
//indexOf(int ch): Returns the index of the first occurrence of the specified character.
//indexOf(int ch, int fromIndex): Returns the index of the first occurrence of the specified character, starting from the given index.
//indexOf(String str): Returns the index of the first occurrence of the specified substring.
//indexOf(String str, int fromIndex): Returns the index of the first occurrence of the specified substring, starting from the given index.
//intern(): Returns a canonical representation of the string.
//isEmpty(): Checks if the string is empty (length is 0).
//lastIndexOf(int ch): Returns the index of the last occurrence of the specified character.
//lastIndexOf(int ch, int fromIndex): Returns the index of the last occurrence of the specified character, searching backward from the given index.
//lastIndexOf(String str): Returns the index of the last occurrence of the specified substring.
//lastIndexOf(String str, int fromIndex): Returns the index of the last occurrence of the specified substring, searching backward from the given index.
//length(): Returns the length of the string.
//matches(String regex): Checks if the string matches the given regular expression.
//offsetByCodePoints(int index, int codePointOffset): Calculates the index of the character that is codePointOffset code points away from the given index.
//regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len): Compares a region of the string to a region of another string.
//replace(char oldChar, char newChar): Replaces occurrences of the specified character with another character.
//replace(CharSequence target, CharSequence replacement): Replaces occurrences of the specified target sequence with another sequence.
//replaceAll(String regex, String replacement): Replaces substrings that match the given regular expression with the specified replacement.
//replaceFirst(String regex, String replacement): Replaces the first substring that matches the given regular expression with the specified replacement.
//split(String regex): Splits the string into an array of substrings using the given regular expression.
//split(String regex, int limit): Splits the string into an array of substrings using the given regular expression and limiting the number of splits.
//startsWith(String prefix): Checks if the string starts with the given prefix.
//startsWith(String prefix, int toffset): Checks if the substring starting from the specified index starts with the given prefix.
//subSequence(int beginIndex, int endIndex): Returns a new CharSequence that is a subsequence of this string.
//substring(int beginIndex): Returns a substring starting from the specified index.
//substring(int beginIndex, int endIndex): Returns a substring within the specified range.
//toCharArray(): Converts the string to a character array.
//toLowerCase(): Converts the string to lowercase.
//toLowerCase(Locale locale): Converts the string to lowercase using the specified locale.
//toString(): Returns the string itself.
//toUpperCase(): Converts the string to uppercase.
//toUpperCase(Locale locale): Converts the string to uppercase using the specified locale.
//trim(): Removes leading and trailing whitespace.
//valueOf(any value): Converts different data types to their string representation.
