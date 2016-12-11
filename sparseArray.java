package InternIntPractice;

import java.util.*;

public class sparseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int nP = scan.nextInt();
		scan.nextLine();
		HashMap<Integer, String> ht = new HashMap<Integer, String>();
		for(int i=0;i<nP;i++){
			ht.put(i, scan.nextLine());
		}
		int nQ = scan.nextInt();
		scan.nextLine();
		int count = 0;
		for(int i=0;i<nQ;i++){
			count = 0;
			if(ht.containsValue(scan.nextLine())){
				count++;
			}
		}
		
		
		/*
		scan.close();
		int[] arrCount = new int[nQ];
		int count = 0;
		for(int i = 0; i < nQ; i++){
			count = 0;
			for(int j = 0; j < nP; j++){
				if(arrNq[i].equals(arrNp[j])){
					count++;
				}
			}
			arrCount[i] = count;
		}
		for(Integer i: arrCount){
			System.out.print(i+" ");
		}
*/	}
}
