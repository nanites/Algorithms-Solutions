package InternIntPractice;

public class testbitwise {

	public static void main(String[] args) {
		/*
		 * permutation("ABC"); }
		 * 
		 * private static void permutation(String string) {
		 * printPermutation(string,""); }
		 * 
		 * private static void printPermutation(String string, String
		 * permutation) {
		 * 
		 * if(string.length()==0){ System.out.println(permutation); return; }
		 * 
		 * for (int i = 0; i < string.length(); i++) { char
		 * toAppendToPermutation = string.charAt(i); String remaining =
		 * string.substring(0, i) + string.substring(i + 1);
		 * 
		 * printPermutation( remaining, permutation + toAppendToPermutation); }
		 */
		String str = "uvwx";
		int rotateBy = 4;
		char[] c = str.toCharArray();
		String result = "";
		int low = 97;
		int high = 122;
		for(int i = 0; i < c.length; i++){
			int a = (int)c[i];
			a = a+4;
			if(a>high){
				int k = a-high;
				a = k + low - 1;
			}
			result = result + (char)a;
		}
		System.out.println(result);
	}
}
