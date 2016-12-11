package InternIntPractice;

import java.util.ArrayList;

public class GoogleStringsRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		String result = "mno";
		int rotateBy = 4;
		if(matchStrings(str, result, rotateBy)){
			System.out.println("We found it");
		} else{
			System.out.println("Oops");
		}
		
		
	}

	private static boolean matchStrings(String str, String result, int rotateBy) {
		ArrayList<String> list = new ArrayList<String>();
		char[] c = str.toCharArray();
		int low = 97;
		int high = 122;
		int index = 26;
		char[] string = c;
		while (index > 0) {
			for (int i = 0; i < string.length; i++) {
				int a = (int) string[i];
				a = a+1;
				if (a > high) {
					int k = a - high;
					a = k + low - 1;
				}
				string[i] = (char)a;
			}
			String finalAdd = new String(string);
			index--;
			list.add(finalAdd);
		}
		for(int i = 0; i < list.size(); i++){
			String s = list.get(i);
			if(s.equalsIgnoreCase(result)){
				System.out.println("At "+i);
				return true;
			}
		}
		return false;
	}

}
