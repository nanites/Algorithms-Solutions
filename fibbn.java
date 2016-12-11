import java.util.Scanner;

public class fibbn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 1; i <= n; i++){
				System.out.print(fibb(i)+" ");
		}
		System.out.println();
		System.out.println(fibb(n));
	}

	private static int fibb(int n) {
		// TODO Auto-generated method stub
		if(n==1 || n == 2){
			return 1;
		}
		return fibb(n-1)+fibb(n-2);
	}

}
