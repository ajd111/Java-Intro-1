/*
 * Switch_Statements. java
 * 
 * Rating message system
 * 
 */
import java.util.Scanner;

public class Switch_Statements {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a rating 1 - 5: ");
		int rating = input.nextInt();
		
		// print a message corresponding to the rating. 
		switch (rating) {
			case 1: System.out.println("Stringly Disagree"); 
				break;
			case 2: System.out.println("Disagree");
				break;
			case 3: System.out.println("Neitral");
				break;
			case 4: System.out.println("Agree");
				break;
			case 5: System.out.println("Strongly Agree");
				break;
			default: System.out.println("Invalid Rating");
		}
		System.out.println("Thank you for your input.");
		
		

	}

}
