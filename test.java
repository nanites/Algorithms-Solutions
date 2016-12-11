package InternIntPractice;

public class test {
	public static void main(String[] args){
	/*	String str1 = "Navdeep";
		String str2 = "Navdeep";
		if(anagrams(str1, str2)){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		
		*/
		
		int[] arr = {1,1,0};
		int i = 0;
		int len = arr.length;
		while(i < len){
			if(arr[i] == 0){
				
			}
			else if(arr[i]>0){
				i = (i + arr[i])%len;
			}else{
				i = (i - arr[i])%len;
			}
		}
		System.out.println("No loop");
		
		//System.out.println(++i);
	}

	private static boolean anagrams(String str1, String str2) {
		// TODO Auto-generated method stub
		if(str1.length() != str2.length()){
			return false;
		}
		int[] letter = new int[256];
		for(int i = 0; i < str1.length(); i++){
			letter[str1.charAt(i)]++;
			letter[str2.charAt(i)]--;
		}
		for(Integer k : letter){
			if(k!=0){
				return false;
			}
		}
		return true;
	}
}
