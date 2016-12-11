
public class multiple {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			String str = "";
			if(i%3==0)
				str = str + "fizz";
			if(i%5==0)
				str = str + "buzz";
			if(!str.isEmpty())
			{
				System.out.println(str);
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}			
