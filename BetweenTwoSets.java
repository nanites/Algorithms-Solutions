package InternIntPractice;

import java.util.*;

public class BetweenTwoSets {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int nA = scan.nextInt();
		int nB = scan.nextInt();
		int[] a = new int[nA];
		int[] b = new int[nB];
		for(int i = 0; i < nA; i++){
			a[i] = scan.nextInt();
 		}
		for(int i = 0; i < nB; i++){
			b[i] = scan.nextInt();
 		}
		getX(a,b,nA,nB);
	}

	private static void getX(int[] a, int[] b, int nA, int nB) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 1; i < nA; i++){
			if(a[i]%i == 0){
				for(int j = 0; j < nB; j++){
					if(i%b[j]==0){
						al.add(i);
					}
		 		}
			}
 		}
		System.out.println(al.toString());
	}
}
