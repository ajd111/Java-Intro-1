/*
 * While_Loops.java
 * 
 * sum of squares example
 * 
 * while loops - tests condition first 
 * iterations
 * 
 */

public class While_Loops {

	public static void main(String[] args) {
		
		int n = 0;
		int sumq = 0;
		
		while (sumq < 100) {
			n++;
			sumq = sumq + (n * n);
			System.out.println(n + " " + sumq);
		}
		
		System.out.printf("The sum of squares up to %d is %d.\n",
				n, sumq);
		

	}

}
