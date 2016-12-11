package InternIntPractice;

import java.util.Random;

public class ShuffleaDeck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int deckLength = 52;
		int[] deck = new int[deckLength];
		for(int i = 0; i < deckLength; i++){
			deck[i] = i+1;
		}
		
		
		Random rand = new Random();
		for(int i = 0; i < deckLength; i++){
			int randNumber = rand.nextInt(deckLength);
			
			int temp = deck[i];
			deck[i] = deck[randNumber];
			deck[randNumber] = temp;
		}
		
		for(int i: deck){
			System.out.print(i+",");
		}
	}
}
