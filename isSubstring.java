
public class isSubstring {
	public static void main(String[] args){
		String s1 = "navdeep";
		String s2 = "navdeep1";
		
		if(s1.length() == s2.length() && s1.length()>0)
		{
			String s1s2 = s1+s1;
			if(s1s2.contains(s2))
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
	}
}
