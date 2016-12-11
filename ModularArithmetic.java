package InternIntPractice;

public class ModularArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mod = 13;

		int[][] result = new int[mod][mod];

		for (int i = 1; i < mod; i++) {
			for (int j = 1; j < mod; j++) {
				//int number = (int)Math.pow(i, j);
				int number = i*j;
				result[i][j] = number % mod;
			}
		}
		
		for (int i = 1; i < mod; i++) {
			for (int j = 1; j < mod; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

}
