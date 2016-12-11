package InternIntPractice;

public class traverse2drecursion {

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][3];
		int count = 1;
		for(int i = 0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++){
				arr[i][j]=count++;}
		}
		int row = 0;
		int column = 0;
		recursion1(column, row, arr, 5);
	}

	/*private static void recursion(int[][] array, int row, int col, int c) {
	    if(array[row][col]==c){
	        System.out.print("Location: " + row + " " + col );
	    } else {
	        if(col+1<array[0].length){
	            recursion(array, row,col+1,c);
	        } else if(row + 1<array[1].length){
	            recursion(array, row+1,0,c);
	        } else {
	            System.out.print("Does not exist");
	            //System.out.print(arry[0][1]); 
	        }
	    }
	}*/
	
	private static void recursion1(int row, int col, int[][] arr, int i) {
		// TODO Auto-generated method stub
		if(arr[row][col] == i){
			System.out.println("Location: "+row+" "+col );
		}
		else{
			if(col+1<arr[0].length){
				recursion1(row, col+1, arr, i);
			}
			else if(row+1<arr[1].length){
				recursion1(row+1, 0, arr, i);
			}
			else{
				System.out.println("Does not exist");
			}
		}
	}
}
