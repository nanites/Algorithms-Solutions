import java.util.ArrayList;
import java.util.Scanner;

public class SpaceReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char[] charr = str.toCharArray();
		int charlen = charr.length;
		int nspace = 0;
		for(int i=0;i<charlen;i++)
		{
			if(charr[i]==' ')
			{
				nspace++;
			}
		}
		int newLen = charlen + nspace*2;
		for(int i=charlen-1; i>=0;i--)
		{
			if(charr[i]==' ')
			{
				charr[newLen - 1] = '%';
				charr[newLen - 2] = '2';
				charr[newLen - 3] = '0';
				newLen = newLen - 3;
			}
			else
			{
				charr[newLen - 1] = charr[i];
				newLen = newLen - 1;
			}
		}
		System.out.println(charr);
	}
}
