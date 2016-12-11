package InternIntPractice;

public class reverseStringWithWords {
	public static void main(String[] args){
		String str = "Hello World";
		String[] words = str.split(" ");
		int start = 0;
		int end = words.length-1;
		while(start<end){
			String temp = words[start];
			words[start] = words[end];
			words[end] = temp;
			start++;
			end--;
		}
		for(String w: words){
			System.out.println(w);
		}
	}
}
