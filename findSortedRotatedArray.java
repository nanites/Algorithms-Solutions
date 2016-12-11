
public class findSortedRotatedArray {
	
	
	static int findPivot(int arr[], int low, int high)
	{
	   // base cases
	   if (high < low)  return -1;
	   if (high == low) return low;
	 
	   int mid = (low + high)/2;   /*low + (high - low)/2;*/
	   if (mid < high && arr[mid] > arr[mid + 1])
	       return mid;
	   if (mid > low && arr[mid] < arr[mid - 1])
	       return (mid-1);
	   if (arr[low] >= arr[mid])
	       return findPivot(arr, low, mid-1);
	   return findPivot(arr, mid + 1, high);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		int pivot = findPivot(arr, 0, arr.length-1);
		System.out.println(pivot);
	}

}
