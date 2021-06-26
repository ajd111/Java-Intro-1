/*
 * If_And_If_Else_Statements.java
 * 
 * Number classification program
 * 
 * if statements - unary
 * if-else statements 
 * 
 * checking conditions
 * modulus 
 * 
 * sometimes, braces {} are not necessary, like using one line
 * with an if statement, but you should always use them anyways 
 * 
 */
import java.util.Scanner;

public class If_And_If_Else_Statements {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		
		if (number % 2 == 0) {
			System.out.println(number + " is even.");
		}
		
		if (number % 7 == 0) {
			System.out.println(number + " is a multiple of 7.");
		}
		
		///////////////////////////////////////////////////
		// an if-else example from the previous programs //
		///////////////////////////////////////////////////
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age in years: ");
		int years = scanner.nextInt();
		
		if (years > 0) {
			int days = years * 365;
			System.out.format("%d years is about %d days.\n", 
					years, days);
		}
		else {
			System.out.println("Age must be greater than 0");
		}
		scanner.close();
	}

}
