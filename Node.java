
import java.util.*;

public class Node {
	/*
	 * String reverse(String str) { if ((str==null)||(str.length() <= 1) ){
	 * 
	 * return str;
	 * 
	 * } System.out.println(reverse(str.substring(1)) + str.charAt(0)); return
	 * reverse(str.substring(1)) + str.charAt(0); }
	 */

	public int frequency; // the frequency of this tree
	public char data;
	public Node left, right;

	void decode(String S, Node root) {
		StringBuilder sb = new StringBuilder();
		Node n = root;
		while (!S.isEmpty()) {
			if(S.charAt(0)=='1'){
				n = n.right;
				S.substring(1);
			}
			else{
				n = n.left;
				S.substring(1);
			}
			if(n.left==null && n.right==null){
				sb.append(n.data);
				n = root;
			}
		}
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scan = new Scanner(System.in); String str = scan.nextLine();
		 * Set<Character> ht = new LinkedHashSet<Character>(); char[] c =
		 * str.toCharArray();
		 * 
		 * for(Character i : c) { ht.add(i); }
		 * System.out.println(ht.toString()); test obj=new test(); String str =
		 * "Quora"; System.out.println("Reverse of \'"+str+"\' is \'"
		 * +obj.reverse(str)+"\'");
		 */

	}
}
