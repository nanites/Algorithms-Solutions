public class IndexOfImpl {

	public static void main(String[] args) {
		String str = "utkarsh";
		String substr = "kar";
		int strLen = str.length();
		int subStrLen = substr.length();
		int s1 = 0;
		int s2 = 0;
		int pos = 0;
		while (s1 < strLen) {
			if (str.charAt(s1) == substr.charAt(s2)) {
				s1++;
				s2++;
			} else if (str.charAt(s1) != substr.charAt(s2)) {
				s1++;
				s2 = 0;
			}
			if (s2 == (subStrLen)) {
				pos = s1 - s2;
				break;
			}
		}
		if (s2 == (subStrLen))
			System.out.println("Index True, Postion ->" + pos);
		else
			System.out.println("String Not Found !");
	}
}