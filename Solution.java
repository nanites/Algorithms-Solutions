import java.util.*;

public class Solution {
	public static void main(String args[]) throws Exception {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT
		 */

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while (T-- > 0) {
			int n = scan.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scan.nextInt();
			}
			
			int root = arr[0];
			
			BinarySearchTree bst = new BinarySearchTree(root);
			for(int i=1;i<arr.length;i++)
			{
				bst.addNode(arr[i]);
			}
			ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(bst.PreOrder());
		
		}
	}

	public static class BinarySearchTree {
		private int data;
		private BinarySearchTree left;
		private BinarySearchTree right;

		BinarySearchTree(int n) {
			this.data = n;
			this.left = null;
			this.right = null;
		}

		public void addNode(int num) {
			if (num < this.data) {
				if (this.left != null) {
					this.left.addNode(num);
				} else {
					this.left = new BinarySearchTree(num);
				}

			} else {
				if (this.right != null) {
					this.right.addNode(num);
				} else {
					this.right = new BinarySearchTree(num);
				}

			}
		}

		public int PreOrder() {
			int a = this.data;
			if (this.left != null) {
				this.left.PreOrder();
			}
			if (this.right != null) {
				this.right.PreOrder();
			}
			return a;
		}

	}
}