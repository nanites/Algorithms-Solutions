import java.util.Scanner;

public class NodeDoublyLLInsert {
	public static void main(String[] args) {
		int i;
		int val = 12;
		for (i=2; i*i <= val; i++)
			if (val % i == 0)
			{
				System.out.println(i);
			}
		System.out.println(val);
	}
}
