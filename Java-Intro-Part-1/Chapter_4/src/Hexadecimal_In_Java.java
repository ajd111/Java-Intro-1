/*
 * Hexadecimal_In_Java.java
 * 
 * Hexadecimal: base 16
 * 
 * 0 1 2 3 4 5 6 7 8 9 A  B  C  D  E  F  10
 * 
 *  binary: base 2 
 *  
 *  					  
 */

public class Hexadecimal_In_Java {

	public static void main(String[] args) {
		
		
		// example of the first 3 powers of 16
		int[] base16 = {(int) Math.pow(16, 1), 
				(int) Math.pow(16, 2), 
				(int) Math.pow(16, 3)}; 
		
		for (int i = 0; i < base16.length; i++) {
			System.out.println(base16[i] + " ");
		}
		
		// HEX bit pattern
		int bitPattern = 0xAC; // binary 1010 1100
		System.out.println(bitPattern);
		
		

	}

}
