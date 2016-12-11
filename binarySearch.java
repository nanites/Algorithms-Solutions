
public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int n = 3;
		int low = 0;
	         int high = arr.length - 1;
		          
		        while(high >= low) {
		             int middle = (low + high) / 2;
		             if(arr[middle] == n) {
		                 System.out.println(middle);
		             }
		             if(arr[middle] < n) {
		                 low = middle + 1;
		             }
		             if(arr[middle] > n) {
		                 high = middle - 1;
		             }
		
//		int start = 0;
//		int end = arr.length-1;
//		
//		while(start<=end)
//		{
//			int mid = (start+end)/2;
//			if(arr[mid] == n)
//			{
//				System.out.println(mid);
//			}
//			else if(n>arr[mid])
//			{
//				start = mid+1;
//			}
//			else if(n<arr[mid])
//			{
//				end = mid-1;
//			}
//		}
		        }	
	}
}
