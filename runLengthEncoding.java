package InternIntPractice;

public class runLengthEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "wwwwaaadexxxxxx";
		encode1(str);
		//encode2(str);
	}

	private static void encode2(String str) {
		// TODO Auto-generated method stub
		String result = "";
		char a = 0;
		int count = 1;
		for(int i = 0; i < str.length(); i++){
			if(a == str.charAt(i)){
				count++;
			}
			else{
				result = result + a;
				if(count != 1){
					result = result + count;
				}
				a = str.charAt(i);
				count = 1;
			}
		}
		result = result + a;
		if(count != 1){
			result = result + count;
		}
		System.out.println(result);
	}

	private static void encode1(String str) {
		// TODO Auto-generated method stub
		char[] c = str.toCharArray();
		int[] letter = new int[256];
		for(int i = 0; i < c.length; i++){
			letter[c[i]]++;
		}
		char rChar;
		int rInt;
		for(int i = 0; i < letter.length; i++){
			if(letter[i]>0){
				rChar = (char) i;
				rInt = letter[i];
				System.out.print(rChar);
				System.out.print(rInt);
			}
		}
	}
}
