/*
 * Short_Circuit_Evaluation_Of_Conditionals.java
 * 
 * calculates rebate given the average order amount
 * 
 * short circuit : tied to truth tables for && || etc. 
 *     evaluates only when necessary
 * 
 */
import java.util.Scanner;

public class Short_Circuit_Evaluation_Of_Conditionals {

	public static void main(String[] args) {
		
		final double REBATE_RATE = 0.05;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter total amount pruchased: $");
		double total = input.nextDouble();
		
		System.out.print("Enter number of orders: ");
		int nOrders = input.nextInt();
		
		double rebate;
		
		if (nOrders > 0 && total / nOrders >= 30.0) {
			double amount = REBATE_RATE * total;
			System.out.format("Your rebate amount is $%.2f\n",
					amount);
		} else {
			System.out.println("Sorry, you don't get a rebate.");
		}
		
		
		
	}

}
