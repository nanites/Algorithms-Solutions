import java.util.*;

public class possiblePalindromes {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,1,3,4,7};
		int n = arr.length;
		int sum = 12;
		int count=0;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k] < sum)
					{
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
