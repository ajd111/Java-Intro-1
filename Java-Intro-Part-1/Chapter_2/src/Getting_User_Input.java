/*
 * Getting_User_Input.java
 * 
 * continuation of the previous program
 * asks user for input and prints the results
 * 
 * the Scanner Class
 * 
 */

import java.util.Scanner;

public class Getting_User_Input {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age in years: ");
		
		//input prompt
		int ageInYears = input.nextInt();
		
		int ageInDays = ageInYears * 365;
		
		System.out.println("You are about " + 
				ageInDays + " days old");
		
	}

}
