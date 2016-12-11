import java.math.*;
import java.util.*;

public class nthToLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			char[] orig = str.toCharArray();
			int start = 0;
			int end = orig.length-1;
			while(start<end)
			{
				if(!isAlphabet(orig[start]))
				{
					start++;
				}
				else if(!isAlphabet(orig[end]))
				{
					end--;
				}
				else
				{
					char temp = orig[start];
					orig[start] = orig[end];
					orig[end] = temp;
					start++;
					end--;
				}
			}
			for(char c : orig)
			{
				System.out.print(c);
			}
	}

	private static boolean isAlphabet(char c) {
		// TODO Auto-generated method stub
		if(c >= 'a' && c <= 'z')
			return true;
		return false;
	}
}
