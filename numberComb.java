import java.util.Scanner;

public class numberComb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		for(int i=1;i<=n;i++)
		{
			String str = "";
			if(i%3==0)
			{
				str = str + "Fizz";
			}
			if(i%5==0)
			{
				str = str + "Buzz";
			}
			if(str.equals(""))
			{
				str = str + i;
			}
			System.out.println(str);
		}
		
	}
}
