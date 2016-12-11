import java.util.ArrayList;

public class dtohex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digits = "0123456789ABCDEF";
		String hex = "3F21";
        int l = hex.length();
		if (l == 0) {
        	System.out.println("0");
        }
		int i = 0;
        int dec = 0;
        while (l > 0) {
        	int d = digits.indexOf(hex.charAt(l-1));
        	int k = (int)Math.pow(16, i);
            dec = dec + (d*k);
            l = l - 1;
            i++;
        }
        System.out.println(dec);
	}

}
