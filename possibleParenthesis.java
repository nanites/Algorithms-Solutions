package InternIntPractice;

import java.util.ArrayList;

public class possibleParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		ArrayList<String> result = new ArrayList<String>();
		System.out.println(generate(n).toString());
	}

	private static ArrayList<String> generate(int n) {
		// TODO Auto-generated method stub
		ArrayList<String> result = new ArrayList<String>(); 
		generateParentheses(result, "", n, n);
		return result;
	}

	private static void generateParentheses(ArrayList<String> result, String string, int left, int right) {
		// TODO Auto-generated method stub
		if(left>right){
			return;
		}
		if(left == 0 && right == 0){
			result.add(string);
			return;
		}
		if(left > 0)
			generateParentheses(result, string+"(", left-1, right);
		if(right > 0)
			generateParentheses(result, string+")", left, right-1);
	}
}