package InternIntPractice;

import java.util.HashMap;

public class hashingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(1, "apple");
		hashmap.put(7, "lemon");
		hashmap.put(4, "orange");
		hashmap.put(6, "banana");
		hashmap.put(3, "litchi");
		hashmap.put(5, "mango");
		hashmap.put(2, "papaya");

		System.out.println(hashmap.size());

		for (String key : hashmap.values()) {
			System.out.println(key);
		}
	}
}
