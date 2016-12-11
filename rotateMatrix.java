package InternIntPractice;

public class rotateMatrix {

	
	static int matrix_size = 2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = new int[matrix_size][matrix_size];
		int count = 0;
		int last = matrix_size-1;
		for(int i=0;i<2;i++)
		{
			for(int j = 0;j<2;j++)
			{
				m[i][j] = count++;
			}
		}
		System.out.println("---------->Original Matrix<-------------");
		printMatrix(m);
		
		System.out.println("---------->Rotated Matrix<--------------");
		
		for(int i=0;i<last;i++)
		{
			swap(m, m[i][i], m[i][last]);
			swap(m, m[i][i], m[last][last]);
			swap(m, m[i][i], m[last][i]);
		}
		printMatrix(m);
		
		
	}
	
	static void swap(int[][] arr, int i, int j)
	{
		int temp[] = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void printMatrix(int m[][])
	{		
		for(int i=0;i<2;i++)
		{
			for(int j = 0;j<2;j++)
			{
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
}
