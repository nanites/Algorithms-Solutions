package InternIntPractice;

public class rotateArraybyd {

	public static void main(String[] args) {
		//
		int d = 2;
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int a = arr.length - d;
		reverse(arr, 0, a-1);
		reverse(arr, a, arr.length-1);
		reverse(arr, 0, arr.length-1);
		for(int c : arr){
			System.out.println(c);
		}
	}

	private static void reverse(int[] arr, int left, int right) {
		while(left < right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
}
