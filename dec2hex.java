
public class dec2hex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "012345678";
		String hex = "131";
		int dec = 89;
		
		encodeto16(str, hex);
		decodefrom16(str, dec);
		
		
		
		
		
		
		
	}

	private static void decodefrom16(String str, int dec) {
		// TODO Auto-generated method stub
		String res = "";
		while(dec>0){
			int d = dec%8;
			res = str.charAt(d) + res;
			dec = dec/8;
		}
		System.out.println(res);
		
	}

	private static void encodeto16(String str, String hex) {
		// TODO Auto-generated method stub
		int val = 0;
		for(int i = 0; i < hex.length(); i++){
			int d = str.indexOf(hex.charAt(i));
			val = val*8 + d;
		}
		System.out.println(val);
	}

}
