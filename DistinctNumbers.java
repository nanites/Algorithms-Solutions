package InternIntPractice;

import java.util.*;



public class DistinctNumbers {
    public static void main(String[] args) {

        int[] nums=  {1,3,2,3,4,3,2,5,4,6}; 
        int [] T2 = EliminateDuplicate(nums);
        for (int i = 0; i < T2.length; i++) {
            System.out.println(T2[i]);

        } 
    }
    public static boolean exist(int x,int []A){
        for (int i = 0; i < A.length; i++) {
            if(x==A[i]){
                return true;
            }
        }
        return false;
    }
    public static int [] EliminateDuplicate(int [] numbers){
       int [] B = new int[numbers.length];
       int i=0,j=0;
       for(i=0;i<numbers.length;i++){
           if(!exist(numbers[i], B)){
               B[j] = numbers[i];
               j++;
           }

       }
       /*int[] C = new int[j];
        for (int k = 0; k < C.length; k++) {
            C[k] = B[k];

        }*/
       return B;
    }


}