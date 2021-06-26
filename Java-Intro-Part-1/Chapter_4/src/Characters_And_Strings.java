/*
 * Characters_And_Strings.java
 * 
 * characters are in single quotes --> 'a' 
 * Character class has many methods
 * 
 * Strings are OBJECTS
 * strings are in double quotes --> "This is a string"
 * String class has many methods
 * strings must be capitalized --> String message = ...
 * 
 * escape sequences
 * 
 */

public class Characters_And_Strings {

	public static void main(String[] args) {
		
		// some examples of characters
		char lowerCaseA = 'a';
		char tildeN = '\u00f1';
		
		System.out.println(lowerCaseA);
		System.out.println(tildeN);
		
		// some examples of strings
		String message = "Java";
		String emptyString = " ";
		
		//double quote inside of a double quoted string
		String greet = "She said \"HI\" to us.";
		
		System.out.println(message);
		System.out.println(greet);
		

	}

}
