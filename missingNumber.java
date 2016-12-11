package InternIntPractice;

import java.util.Arrays;

public class missingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4, 3, 6, 2, 1, 1};
		int[] temp = new int[a.length];
		for(int i = 0; i < temp.length; i++){
			temp[i] = 0;
		}
		
		for(int i = 0; i< a.length; i++){
			if(temp[a[i]]==0){
				temp[a[i]] = 1;
			}
		}
	}
}
