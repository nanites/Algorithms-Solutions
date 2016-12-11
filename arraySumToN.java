import java.util.*;

public class arraySumToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9};
		Hashtable<Integer, Integer> at = new Hashtable<Integer, Integer>();
		for(int i = 0; i< a.length;i++)
		{
			if(at.containsKey(a[i]))
			{
				System.out.println(a[i]+" "+at.get(a[i]));
			}
			else
			{
				at.put(10-a[i], a[i]);
			}
		}
	}
}
