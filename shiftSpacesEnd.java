
public class shiftSpacesEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am awesome and I know it man";
		int pos = str.length()-1;
		char[] c = str.toCharArray();
		int i = 0;
		int len = c.length;
		while(i < len){
			if(c[i] == ' '){
				char temp = c[i];
				for(int j = i; j < c.length - 1; j++){
					c[j] = c[j+1];
				}
				c[pos] = temp;
				pos = pos - 1;
				len = len - 1;
			}
		i = i + 1;
		}
		for(char ch : c){
			System.out.print(ch);
		}
	}
}
