/*
 * Nested_If_Statements.java
 * 
 * program calculates tax + total 
 * 
 * final keyword : constants (variables)
 * 
 * make sure to test thoroughly 
 */
import java.util.Scanner;

public class Nested_If_Statements {

	public static void main(String[] args) {
		
		final double TAX_RATE = 0.07;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter item price: $");
		double price = input.nextDouble();
		
		if (price > 0) {
		
			System.out.println("Enter quantity: ");
			int quantity = input.nextInt();
			
			if (quantity > 0) {
				
				double subtotal = quantity * price;
				double tax = subtotal * TAX_RATE;
				double total = subtotal + tax;
				System.out.format("Subtotal: $%8.2f\n", subtotal);
				System.out.format("Tax:      $%8.2f\n", tax);
				System.out.format("Total:    $%8.2f\n", total);
			}
			else {
				System.out.println("The quantity must be "
						+ "greater than 0");
			}
			
			
		}
		else {
			System.out.println("The price must be "
					+ "greater than 0.");
		}
		
		
		/* ALTERNATE METHOD
		 * 
		 * if (price <= 0.0 && quantity > 0) {
		 *     code 
		 *         goes
		 *             here
		 * }
		 * else {
		 *     if (price <= 0.0) { 
		 *         code goes here
		 *     }
		 *     if (quantity <= 0.0) {
		 *         code goes here
		 *     }
		 */
		
	}

}
