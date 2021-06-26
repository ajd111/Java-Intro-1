/*
 * Input_With_A_While_Loops.java
 * 
 * leap year test
 * 
 * Sentinel value
 * 
 */
import java.util.Scanner;

public class Input_With_A_While_Loop {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year or 0 to quit: ");
		int year = input.nextInt();
		
		while (year != 0) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.printf("%d is a leap year.\n", year);
			} else {
				System.out.printf("%d is not a leap year.\n", year);
			}
			
			System.out.println("Enter another year or 0 to quit: ");
			year = input.nextInt();
		}
		
		System.out.println("Finished.");
		
	}

}
