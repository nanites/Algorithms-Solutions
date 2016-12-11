package InternIntPractice;

import java.util.Scanner;

public class BinarySearchTree {

	int data;
	BinarySearchTree left;
	BinarySearchTree right;

	public BinarySearchTree(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}

	void add(int num) {

		if (this.data != num) {
			if (num < data) {
				if (this.left != null) {
					this.left.add(num);
				} else {
					this.left = new BinarySearchTree(num);
				}
			} else {
				if (this.right != null) {
					this.right.add(num);
				} else {
					this.right = new BinarySearchTree(num);
				}
			}
		}
	}

	public void traversePreOrder() {
		System.out.println(this.data);
		if (this.left != null) {
			this.left.traversePreOrder();
		}
		if (this.right != null) {
			this.right.traversePreOrder();
		}
	}

	public void traverseInOrder() {
		if (this.left != null) {
			this.left.traversePostOrder();
		}
		System.out.println(this.data);
		if (this.right != null) {
			this.right.traversePostOrder();
		}
	}

	public void traversePostOrder() {
		if (this.left != null) {
			this.left.traversePostOrder();
		}
		if (this.right != null) {
			this.right.traversePostOrder();
		}
		System.out.println(this.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * while(scan.hasNext()) { tree.add(scan.nextInt()); }
		 */
		BinarySearchTree tree = new BinarySearchTree(3);
		int[] nums = { 3, 5, 1, 4, 2, 6 };
		for (int i : nums) {
			tree.add(i);
		}

		tree.traversePreOrder();
		tree.traverseInOrder();
		tree.traversePostOrder();
	}

}
