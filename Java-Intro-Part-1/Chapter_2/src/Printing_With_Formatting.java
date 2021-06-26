/*
 * Printing_With_Formatting.java 
 * 
 * calculates age in days, given age in years
 * 
 * jShell 
 * 
 * String formatting 
 * System.out.format();
 * escape sequences
 */
import java.util.Scanner;

public class Printing_With_Formatting {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your are in years: ");
		int years = input.nextInt();
		int days = years * 365;
		
		System.out.format("That is about %d days.\n", days);
		
	}
}
