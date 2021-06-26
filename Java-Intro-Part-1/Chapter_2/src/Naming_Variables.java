/*
 * Naming_Variables.java 
 * 
 * sample program calculates someone's age and prints to the
 * screen
 * 
 * instead of using "y" and "d" -> use "years" and "days"
 * 		OR "age_in_days" and "age_in_days"
 * 		OR "ageInYears" and "ageInDays"
 * variable names must be as meaningful as possible
 * 
 */
public class Naming_Variables {

	public static void main(String[] args) {
		int years = 21;
		int days = years * 365;
		
		System.out.println("You are about " + 
				days + " days old");
	}

}
