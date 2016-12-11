import java.util.Scanner;

public class stairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=n;i>0;i--)
		{
			int h = n - i + 1;
			int s = n - h;
			while(s>0)
			{
				System.out.print(" ");
				s--;
			}
			while(h>0)
			{
				System.out.print("#");
				h--;
			}
			System.out.println();
		}
	}
}
