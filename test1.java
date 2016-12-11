import java.util.*;

public class test1 {

	public static void main(String[] args) {
		int[] myArray = new int[]{5,6,8,8,5};
		int count = 0;
		while (!isAllEqual(myArray)) {
			int max = getMax(myArray);
			//System.out.println(max);
			for (int i = 0; i < myArray.length; i++) {
				if (i != max) {
					myArray[i] = myArray[i] + 1;
				}
			}
			count++;
		}
		System.out.println(count);
		
	}
	
	public static boolean isAllEqual(int[] a){
        for(int i=1; i<a.length; i++){
            if(a[0] != a[i]){
                return false;
            }
        }
        return true;
    }
	
	public static int getMax(int[] inputArray){ 
		if (inputArray.length == 0) {
	        return -1;
	    }

	    int max = inputArray[0];
	    int maxIndex = 0;

	    for (int i = 1; i < inputArray.length; i++) {
	        if (inputArray[i] > max) {
	            maxIndex = i;
	            max = inputArray[i];
	        }
	    }

	    return maxIndex;
	  }
}
