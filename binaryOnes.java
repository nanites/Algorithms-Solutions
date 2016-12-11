package InternIntPractice;

public class binaryOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123456;
		countOnes(n);
	}

	private static void countOnes(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		while(n!=0){
			count += n%2;
			n /= 2;
		}
		System.out.println(count);
	}
}
