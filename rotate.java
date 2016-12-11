import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class rotate {

	

	public static void main(String[] args) throws IOException{
		String s1 = "navdeepis";
		String s2 = "isok";
		
		Scanner keyboard = new Scanner(System.in);
		String input;
		
		input = keyboard.nextLine();
		BufferedReader br;
		
		br = new BufferedReader(new FileReader(input));
		
		input = br.readLine();
		int total = Integer.parseInt(input);
		
		while((input = br.readLine()) != null) {
			
		String[] arr = input.split(" ");
			
		}
		
		HashSet<Character> h1 = new HashSet<Character>(), h2 = new HashSet<Character>();
		for(int i = 0; i < s1.length(); i++)                                            
		{
		  h1.add(s1.charAt(i));
		}
		for(int i = 0; i < s2.length(); i++)
		{
		  h2.add(s2.charAt(i));
		}
		h1.retainAll(h2);
		Character[] res = h1.toArray(new Character[0]);
		for(char i : res)
		{
			System.out.print(i);
		}
	}
}
