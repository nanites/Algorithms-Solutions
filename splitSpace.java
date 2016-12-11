package InternIntPractice;

import java.util.*;

public class splitSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc ab asd as asd asd asd ";
		int maxLength = 6;
		int i = 0;
		if (maxLength > str.length()) 
		{
			System.out.println(str);
		}
		ArrayList<String> al = new ArrayList<String>();
		while((i+maxLength) < str.length()) 
		{
			String str1 = str;
			str1 = str1.substring(i, maxLength + 1);
			str1 = str1.substring(i, Math.min(str1.length(), str1.lastIndexOf(" ")));
			al.add(str1);
			i = i + maxLength;
		}
	}
}
