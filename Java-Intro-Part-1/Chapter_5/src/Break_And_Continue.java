/*
 * Break_And_Continue.java
 * 
 * find smallest factor program
 * 
 * break provides an exit point for while loop
 * continue jumps to the end of the loop and starts the next interation
 * 
 */
import java.util.Scanner;

public class Break_And_Continue {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number greater than 2: ");
		int n = input.nextInt();
		
		int factor = 2;
		while (factor <= n) {
			if (n % factor == 0) {
				break;
			}
			factor++;
		}
		System.out.printf("The smallest factor of %d is %d.\n", 
				n, factor);
		input.close();
	
	
	////////////////////////////////
	// program that uses continue //
	////////////////////////////////
	
		int sum = 0;
		int number = 0;
		
		while (number < 100) {
			number++;
			if (number == 7 || number == 8) {
				continue;
			}
			sum += number;
			System.out.printf("number: %d sum: %d\n", number, sum);
		}
		
		System.out.println("The sum is " + sum);
	}
}

