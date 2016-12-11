package InternIntPractice;

public class HashingImplementation {

	static int TABLE_SIZE = 32;

	class HashEntry1 {
		int key;
		int value;

		public HashEntry1(int key, int value) {
			// TODO Auto-generated constructor stub
			this.key = key;
			this.value = value;
		}

		public int getKey() {
			return key;
		}

		public int getValue() {
			return value;
		}
	}

	HashEntry1[] table;

	public HashingImplementation() {
		// TODO Auto-generated constructor stub
		table = new HashEntry1[TABLE_SIZE];
		for (int i = 0; i < TABLE_SIZE; i++) {
			table[i] = null;
		}
	}

	public int get(int key) {
		int hash = key % TABLE_SIZE;
		while (table[hash] != null && table[hash].getKey() != key) {
			hash = (hash + 1) % TABLE_SIZE;
		}
		if (table[hash] == null)
			return -1;
		else
			return table[hash].getValue();
	}

	public void put(int key, int value) {
		int hash = key % TABLE_SIZE;
		while (table[hash] != null && table[hash].getKey() != key) {
			hash = (hash + 1) % TABLE_SIZE;
		}
		table[hash] = new HashEntry1(key, value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashingImplementation hash = new HashingImplementation();
		hash.put(1, 1317);
		hash.put(2,  1313);
		hash.put(3,  1314);
		hash.put(4,  1234);
		
		System.out.println(hash.get(1));
		System.out.println(hash.get(3));
	}

}
