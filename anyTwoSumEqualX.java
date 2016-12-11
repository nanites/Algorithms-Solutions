package InternIntPractice;

import java.util.Arrays;

public class anyTwoSumEqualX {
	public static void main(String[] args) {
	/*	int[] a = { 1, 2, 3, 4, 5 };
		Arrays.sort(a);
		int sum = 5;
		System.out.println(isPresentnlogn(a, sum));
		System.out.println(isPresentn2(a, sum));*/
		
		
	/*        int sumOfAllNumbers = 0;
	        int sumOfNumbersPresent = 0;
	        int blankSpace = 0;
	        for (int i = 0; i < theNumbers.length; i++) {
	            sumOfAllNumbers += i + 1;
	            sumOfNumbersPresent += theNumbers[i];
	            if (theNumbers[i] == 0)
	                blankSpace = i;
	        }
	        System.out.println("Missing number = " + (sumOfAllNumbers - sumOfNumbersPresent) + " at location " + blankSpace +" of the array");*/
	    
		
	        
	    int[] theNumbers = {4,5,6,3,8,9,0,1,2};
	    int index = 0;
		int sumOfAllNumbers = 0;
		int sumOfPresentNumbers = 0;
		for(int i=0;i<theNumbers.length;i++){
			sumOfAllNumbers += i+1;
			sumOfPresentNumbers += theNumbers[i];
			if(theNumbers[i] == 0)
				index = i;
		}
		System.out.println("Missing no. is: "+ (sumOfAllNumbers-sumOfPresentNumbers) + "\nMissing index is: "+ index);
	}

	private static boolean isPresentn2(int[] a, int sum) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == sum)
					return true;
			}
		}
		return false;
	}

	private static boolean isPresentnlogn(int[] a, int sum) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = a.length - 1;
		while (start < end) {
			if (a[start] + a[end] == sum) {
				return true;
			} else if (a[start] + a[end] > sum) {
				end--;
			} else {
				start++;
			}
		}
		return false;
	}
}
