
public class removeDupWithoutBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ababca";
		char[] c = str.toCharArray();
		compact(c);

		for (char ch : c) {
			System.out.println(ch);
		}
	}

	public static void compact(char[] str){
	    int len = str.length;
	    System.out.println(len);
	    int[] a = new int[26];
	    int i;

	    for(i=0;i<len;i++){
	        int t = (int)str[i] - 65;
	        if(a[t]!=1){
	            System.out.println(str[i]);
	        }
	        a[t] = 1;
	    }
	}
}
