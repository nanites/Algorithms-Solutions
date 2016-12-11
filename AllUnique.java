import java.util.Scanner;

public class AllUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		if(isUnique(str))
		{
			System.out.println("Unique");
		}
		else
		{
			System.out.println("Not Unique");
		}
	}
	
	public static boolean isUnique(String str)
	{
		boolean[] charset = new boolean[256];
		for(int i=0;i<str.length();i++)
		{
			int val = str.charAt(i);
			if(charset[val])
				return false;
			else
				charset[val]=true;
		}
		return true;
	}
}
