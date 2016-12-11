
public class beforeAfterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,4,1,5};
		int[] b = {1,2,7,8};
		int[] letters = new int[256];
		for(int i = 0 ; i < a.length; i++){
			letters[a[i]]++;
		}
		for(int j = 0 ; j < b.length; j++){
			letters[b[j]]--;
		}
		for(int k = 0; k < letters.length; k++){
			if(letters[k]>0){
				System.out.println("Deleted :"+ k);
			}else if(letters[k]<0){
				System.out.println("Added :" + k );
			}
		}
	}

}
