package InternIntPractice;

public class AddHyphen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "navdeepthiftring";
		char[] chars = new char[str.length() + str.length()/4];
		int resultIndex = 0;
		int stringIndex = 0;
		while(stringIndex < str.length()){
			if(stringIndex%4==0){
				chars[resultIndex++] = '-';
			}else{
				chars[resultIndex]=str.charAt(stringIndex);
			}
			resultIndex++;
			stringIndex++;
		}
		for(char c: chars){
			System.out.print(c);
		}
	}
}
