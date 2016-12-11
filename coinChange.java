import java.util.*;

public class coinChange {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ratings = new int[n];
		int[] candy = new int[n];

		for (int i = 0; i < n; i++) {
			ratings[i] = scan.nextInt();
		}

		int len = ratings.length;

		candy[0] = 1;
		for (int i = 1; i < len; ++i) {
			if (ratings[i] > ratings[i - 1]) {
				candy[i] = candy[i - 1] + 1;
			} else {
				candy[i] = 1;
			}
		}

		int total = candy[len - 1];
		for (int i = len - 2; i >= 0; --i) {
			if (ratings[i] > ratings[i + 1] && candy[i] <= candy[i + 1]) {
				candy[i] = candy[i + 1] + 1;
			}
			total += candy[i];
		}
		System.out.println(total);
	}
}
