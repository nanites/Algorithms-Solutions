package InternIntPractice;

import java.util.*;

public class ContextSwitchTime {

	public static void main(String[] args) {
		String str1 = "navdeepsinghisawesome";
		String str2 = "a";
		Set<Character> map  = new HashSet<Character>();
		
		for(int i = 0; i < str2.length(); i++){
			map.add(str2.charAt(i));
		}
		String result = "";
		for(int i = 0; i < str1.length(); i++){
			if(!map.contains(str1.charAt(i))){
				result += str1.charAt(i);
			}
		}
		System.out.println(result);
	}
}
