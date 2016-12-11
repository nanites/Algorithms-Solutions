import java.util.*;

public class DepartNegativePositiveArray {

	public static void main(String[] args) {
		int posStartIndex = 0;
		int[] A = { 1, 2, 3, 4, -5, -6, -7, -8 };
		for(int i=0;i<A.length;i++)
		{
			if(A[i]<0)
			{
				int temp = A[i];
				for(int j = i; j > posStartIndex; j--)
				{
					A[j] = A[j-1];
				}
				A[posStartIndex] = temp;
			}
		}
		System.out.println(Arrays.toString(A));
	}
}
