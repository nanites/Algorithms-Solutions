import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.*;

public class removeDubLL {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String master = scan.nextLine();
		while(scan.hasNextLine())
		{
			String save = scan.nextLine();
			System.out.println(isSub(master, save).toString());
		}
		scan.close();
	}

	private static ArrayList<Integer> isSub(String master, String save) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= master.length() - save.length(); i++) {
			if (master.substring(i, save.length()+i).equals(save)) {
				list.add(i);
			}
		}
		return list;
	}
}
