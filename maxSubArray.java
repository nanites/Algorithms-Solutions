package InternIntPractice;

public class maxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {-2,1,-3,4,-1,2,1,-5,4};
		int newsum=A[0];
	       int max=A[0];
	       for(int i=1;i<A.length;i++){
	           newsum=Math.max(newsum+A[i],A[i]);
	           max= Math.max(max, newsum);
	       }
 
		System.out.println(max);
	}

}
