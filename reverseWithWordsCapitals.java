package InternIntPractice;

public class reverseWithWordsCapitals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello Name Mean World";
		char[] c = str.toCharArray();
		int start = 0;
		int end = c.length-1;
		reverse(c, start, end);
		
		for(int i = 0; i <= c.length; i++){
			if(i==c.length || c[i]== ' '  ){
				reverse(c, start, i-1 );
				start = i + 1;
			}
		}
		
		
		/*for(int i = 0; i <= c.length; i++){
			if(i == c.length || c[i]==' '){
				c[start] = (char)(c[start]-32);
				c[i-1] = (char)(c[i-1] + 32);
				start = i + 1;
			}
		}*/
		
		String result = "";
		for(char ch : c){
			result = result + ch;
		}
		System.out.println(result);
	}
	static char[] reverse(char[] words, int start, int end){
		while(start<end){
			char temp = words[start];
			words[start] = words[end];
			words[end] = temp;
			start++;
			end--;
		}
		return words;
	}
}
