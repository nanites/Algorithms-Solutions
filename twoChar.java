package InternIntPractice;

import java.sql.PseudoColumnUsage;
import java.util.*;

public class twoChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String solution = "RGGB";
		char[] solutionChar = solution.toCharArray();
		String guess = "YRGB";
		char[] guessChar = guess.toCharArray();
		int psuedoHits = 0;
		int hits = 0;
		
		Set<Character> set = new HashSet<Character>();

		for(int i = 0; i < solution.length(); i++){
			set.add(solution.charAt(i));
		}
		
		for(int i = 0; i < solution.length(); i++){
			if(solution.charAt(i)==guess.charAt(i)){
				hits++;
				solutionChar[i] = 0;
				guessChar[i] = 0;
			}
		}
		
		for(int i = 0; i < 4; i++){
			
			if (solutionChar[i]!=0) {
				if (set.contains(guess.charAt(i))) {
					psuedoHits++;
				} 
			}
		}
		System.out.println("PsuedoHits: "+psuedoHits);
		System.out.println("Hits: "+hits);
	}
}

