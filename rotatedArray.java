package InternIntPractice;

public class rotatedArray {
	public static void main(String[] args){
		int[] a = {4,5,6,7,1,2,3};
		int start = 0;
		int end = a.length-1;
		int mid, index=0;
		int temp = a[0];
		while(start<=end){
			mid = (start+end)/2;
			if(a[mid] < temp){
				temp = a[mid];
				index = mid;
			}
			
			if(a[mid] <= a[end]){
				end = mid - 1;
			}else{
				start = mid + 1;
			}
		}
		System.out.println(index);
	}
}
