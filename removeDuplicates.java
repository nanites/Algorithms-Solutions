
import java.util.*;


public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "n v ep";
		Set<Character> set = new HashSet<Character>();
		for(int i = 0; i < string.length(); i++){
			if(!set.contains(string.charAt(i))){
				set.add(string.charAt(i));
			}
		}
		System.out.println(set.toString());
	}
}
