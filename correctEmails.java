package InternIntPractice;

import java.util.Scanner;

public class correctEmails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String pattern = scan.nextLine();
		int count = 0;
		for(int i=0 ; i < pattern.length(); i++){
			if(pattern.charAt(i) == '@'){
				count++;
			}
		}
		if(count==1){
			String[] str1 = pattern.split("@");
			char[] c1 = str1[0].toCharArray();
			char[] c2 = str1[1].toCharArray();
			int right = 0;
			int left = 0;
			for(int i=0;i<c1.length;i++){
				if(c1.equals('.') && (c1[i]>'a' && c1[i]<'e'))
				{
					left++;
				}
			}
			for(int j=0;j<c1.length;j++){
				if(c2.equals('.') && (c2[j]>'a' && c2[j]<'e'))
				{
					right++;
				}
			}
			if(left>1 && right>2){
				
			}
		}
	}

}
