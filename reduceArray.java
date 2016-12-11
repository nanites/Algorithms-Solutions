package InternIntPractice;

import java.util.Arrays;
import java.util.Hashtable;

public class reduceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,80,60,20,50};
		int[] temp = new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			temp[i] = arr[i];
		}
		Arrays.sort(temp);
		Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();
		int val = 0;
		for(int i=0;i<temp.length;i++){
			val++;
			hash.put(temp[i], val);
		}
		
		for(int i=0;i<arr.length;i++){
			arr[i] = hash.get(arr[i]);
		}
		
		for (int i=0; i<arr.length; i++)
	        System.out.println(arr[i]+" ");
	}
}
