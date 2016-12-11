package InternIntPractice;

public class makeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(makeChange(100,25));
	}

	private static int makeChange(int n, int denom) {
		// TODO Auto-generated method stub
		int next = 0;
		switch(next)
		{
		case 25: next = 10; break;
		case 10: next = 5; break;
		case 5: next = 1; break;
		case 1: return 1;
		}
		int ways = 0;
		for(int i = 0; i * denom <= n; i++){
			ways = ways + makeChange(n - (1*denom), next);
		}
		return ways;
	}

}
