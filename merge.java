
public class merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };
		int[] r = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				r[k] = a[i];
				i++;
			} else {
				r[k] = b[j];
				j++;
			}
			k++;
		}
		while (i < a.length) {
			r[k] = a[i];
			i++;
			k++;
		}

		while (j < b.length) {
			r[k] = b[j];
			j++;
			k++;
		}

		for (Integer l : r) {
			System.out.println(l);
		}
	}

}
