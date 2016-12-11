package InternIntPractice;

public class swap {
	public static void main(String[] args)
	{
		int p = 2;
		int q = 5;
		System.out.println(p+" ,"+q);
		swap(p, q);
		System.out.println(p+" ,"+q);
	}
	
	static void swap(int a, int b)
	{
		int temp = a;
		a = b;
		b = temp;
	}
}
