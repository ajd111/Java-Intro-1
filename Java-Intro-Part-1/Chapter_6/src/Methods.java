/*
 * Methods.java
 * 
 * methods act like functions from math
 * 
 * modifier dataTypemethodName(dataType parameterName) {
 * }
 * 
 * methods are called
 * 
 * 
 * 
 */

public class Methods {

	public static void main(String[] args) {
		
		// method call
		double y = f(1.5);
		System.out.println(y);

	}
	
	// example of a method
	// f(x) = x^2 + 2x + 1
	public static double f(double x) {
		double result = x * x + 2.0 * x + 1.0;
		return result;
	}

}
