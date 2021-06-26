/*
 * Comparing_Strings.java 
 * 
 * includes a program to compare Strings
 * 
 * Strings are OBJECTS so must use methods of the String class
 * 
 * chaining methods
 * 
 * 
 */
import java.util.Scanner;

public class Comparing_Strings {

	public static void main(String[] args) {
		
		String word1 = "Java";
		// can also be written as : 
		//        "Java".equals("Java);
		////////////////////////////////////
		// check if a string is equal to another string
		System.out.println(word1.equals("Java"));
		System.out.println(word1.equals("Python"));
		
		// check for equality and ignore case 
		System.out.println("Java".equalsIgnoreCase("java"));
		System.out.println("Java".equalsIgnoreCase("jAvA"));
		
		///////////////////////////////////////
		// program using compareTo() method //
		//////////////////////////////////////
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first string: ");
		String str1 = input.nextLine();
		str1 = str1.trim();
		
		System.out.print("Enter the second string: ");
		String str2 = input.nextLine().trim();
		
		if (str1.compareTo(str2) < 0) {
			System.out.println(str1 + " is less than " + str2);
		} else if (str1.compareTo(str2) > 0) {
			System.out.println(str1 + " is greater than " + str2);
		} else {
			System.out.println(str1 + " and " + str2 + 
					" are equal");
		}
		
		
		
	}

}
