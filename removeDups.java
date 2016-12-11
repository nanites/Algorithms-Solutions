import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class removeDups {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			
			//Read a string
			String str = scan.nextLine();
			
			//Initialize result
			int result = 0;
			
			//Iterating the string one character at a time
			for (int i = 0; i < str.length() - 1; i++) {

				//Check if the next value is greater than the current value. If yes, we subtract or else we add.
				if (value(str.charAt(i)) < value(str.charAt(i + 1))) {
					result = result - value(str.charAt(i));
				} else {
					result = result + value(str.charAt(i));
				}
			}
			
			result = result + value(str.charAt(str.length() - 1));
			System.out.println(result);
		}

	}

	//This method would fetch the values for the Roman numerals.
	private static int value(char letter) {

		if (letter == 'X') {
			return 10;
		}
		if (letter == 'V') {
			return 5;
		}
		if (letter == 'I') {
			return 1;
		}
		return 0;
	}
}
