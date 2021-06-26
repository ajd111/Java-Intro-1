/*
 * Input_Loops_Controlled_By_Booleans.java
 * 
 * leap year program V 2.0
 * 
 * booleans
 * 
 * 
 * 
 */
import java.util.Scanner;

public class Input_Loops_Controlled_By_Booleans {

	public static void main(String[] args) {
		
		int year;
		boolean finished = false;
	
		while (!finished) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a year: ");
			year = input.nextInt();
			
			if (year != 0) {
				if ((year % 4 == 0 && year % 100 != 0)
						|| (year % 400 == 0)) {
					System.out.printf("%d is a leap year.\n", year);
				} else {
					System.out.printf("%d is not a leap year.\n", year);
				}
			} else {
				finished = true;
			}
			System.out.println("Finished.");
		}
	
	}	

}
