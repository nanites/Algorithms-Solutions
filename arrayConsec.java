import java.util.*;

public class arrayConsec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3,4,5,6,7,2,1 };
		
		if (flag(arr)) {
			System.out.println("Consecutive");
		} else {
			System.out.println("Not Consecutive");
		}
	}

	private static boolean flag(int[] arr) {
		// TODO Auto-generated method stub
		int min = arr[0];
		for (int i = 0; i < arr.length; i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		
		int max = arr[0];
		for (int i = 0; i < arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		
		int n = arr.length;
		
		
		if ((max - min + 1)==n) {
			boolean[] visited = new boolean[n];
			
			for(int i = 0 ; i < n; i++){
				if(visited[arr[i]- min]!=false){
					return false;
				}
				visited[arr[i] - min] = true;
			}
			return true;
		}
		return false;		
	}

}
