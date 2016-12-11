package InternIntPractice;

public class repeatedSquaring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int g = 5, n = 49, p = 11;
		int y = 1;
		while (n>0) {
			if (n % 2 != 0) 
			{
				y = (y*g)%p;
				g = (g*g)%p;
			}
			else
			{
				g = (g*g)%p;
			}
			n = (int)(n/2);
		}
		System.out.println(y);
	}
}
