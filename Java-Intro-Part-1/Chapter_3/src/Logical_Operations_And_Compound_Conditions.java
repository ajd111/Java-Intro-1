/*
 * Logical_Operatons_And_Compound_Conditions.java
 * 
 * && - and : both conditions MUST be true
 * || - or  : either could be true
 * !  - not : self explanatory 
 * ^  - circumflex : exclusive or : either A or B but NOT both
 * 
 * Operational Precedence: 
 ********************************8
 * Highest ------> Lowest
 * 
 *    *   /    +      - 
 *  
 *   < <= >= > == != ^ && || 
 * 
 */

public class Logical_Operations_And_Compound_Conditions {

	public static void main(String[] args) {
		
		// AND 
		if (score >= 0 && score <= 100) {
			System.out.println("This is a valied score.");
		}
		else {
			System.out.println("This is not a valid score.");
		}
		
		// OR 
		if (age < 16 || age >= 65) {
			price = 7.95;
		}
		else {
			price = 9.95;
		}
		
		// circumflex 
		if (length > 10 ^ width > 5) {
			System.out.println("OK to mail.");
		}
		else {
			System.out.println("Not OK to mail.");
		}
		
		
	}

}
