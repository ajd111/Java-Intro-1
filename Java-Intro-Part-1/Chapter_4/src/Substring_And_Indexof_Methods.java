/*
 * Substring_And_Indexof_Methods.java
 * 
 * substring() method: 
 * 		str.substring(start) -->
 * 			the portion from index start to the end of the string
 * 
 * indexOf() method:
 * 		str.indexOf(ch)
 * 		str.indexOf(s)
 * 			returns the position where character ch or string s
 * 			is found within str
 * 
 * 			if not found, returns -1
 */
import java.util.Scanner;

public class Substring_And_Indexof_Methods {

	public static void main(String[] args) {
		
		/*
		 * use of indexOf() and substring() to split
		 * into three separate words
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter up to 3 words separated "
				+ " by commas: ");
		String phrase = input.nextLine();
		
		String word1 = "";
		String word2 = "";
		String word3 = "";
		
		int firstComma = phrase.indexOf(",");
		
		if (firstComma >= 0) {
			word1 = phrase.substring(0, firstComma);
			int secondComma = phrase.indexOf(",", firstComma + 1);
			
			if (secondComma >= 0) {
				word2 = phrase.substring(firstComma + 1, secondComma);
				word3 = phrase.substring(secondComma + 1); // to end
			}else {
				word2 = phrase.substring(firstComma + 1); // to end
			}
		} else {
			word1 = phrase;
		}
		
		word1 = word1.trim();
		word2 = word2.trim();
		word3 = word3.trim();
		
		System.out.println("Word 1: " + word1);
		System.out.println("Word 2: " + word2);
		System.out.println("Word 3: " + word3);

	}

}
