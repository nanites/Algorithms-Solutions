import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb.toString());
//		
//		int begin = 0;
//		char[] charSet = str.toCharArray();
//		int end = charSet.length - 1;
//		char temp;
//		while(end>begin)
//		{
//			temp = charSet[begin];
//			charSet[begin] = charSet[end];
//			charSet[end] = temp;
//			end--;
//			begin++;
//		}
//		for(Character c: charSet)
//		{
//			System.out.println(c);
//		}
	}

}
