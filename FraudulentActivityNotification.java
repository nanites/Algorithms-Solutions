package InternIntPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FraudulentActivityNotification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int k = 1;
		int num = 12324;
		char [] c =("" + num).toCharArray();
		//String number = Integer.toString(num);
		for(int i = 0; i < n/2 && k<2; i++){
			if(c[i]!=c[n-i-1]){
				c[i]=c[n-i-1];
			}
		}
		
		for(char ch : c){
			System.out.println(ch);
		}
	}
}
