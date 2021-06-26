/*
 * Do_Wile_Loops.java
 * 
 * leap year program V 3.0
 * 
 * loop body first, then tests condition(s)
 * 
 * 
 */
import java.util.Scanner; 

public class Do_While_Loops {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int year;
		
		do {
			System.out.print("Enter a year: ");
			year = input.nextInt();
			
			if (year != 0) {
				if ((year % 4 == 0 && year % 100 != 0)
						|| (year % 400 == 0)) {
					System.out.printf("%d is a leap year.\n", year);
				} else {
					System.out.printf("%d is not a leap year.\n", year);
				}
			}
		} while (year != 0);
			
		System.out.println("Finished.");
	}

}
