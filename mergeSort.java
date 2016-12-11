
public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,6,3,2,1};
		mergeSort(arr);
	}

	private static void mergeSort(int[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length;
		int mid = len/2;
		int[] left = new int[mid];
		int[] right = new int[len-mid];
		for(int i=0;i<mid;i++)
		{
			left[i] = arr[i];
		}
		for(int i=mid;i<len;i++)
		{
			right[i-mid] = arr[i];
		}
		mergeSort(left);
		mergeSort(right);
		merging(left, right, arr);
	}

	private static void merging(int[] left, int[] right, int[] arr) {
		// TODO Auto-generated method stub
		int nL = left.length;
		int nR = right.length;
		int i=0,j=0,k=0;
		while(i<nL && j<nR)
		{
			if(left[k]<=right[j])
			{
				arr[k]= left[i];
				i++;
			}
			else
			{
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while(i<nL)
		{
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<nR)
		{
			arr[k]=right[j];
			j++;
			k++;
		}
	}
}
