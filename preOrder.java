package InternIntPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class preOrder {
	int data;
	preOrder left;
	preOrder right;

	public preOrder(int data) {
		this.data = data;
	}

	void add(int num) {
		if (this.data != num) {
			if (num < data) {
				if (this.left != null) {
					this.left.add(num);
				} else {
					this.left = new preOrder(num);
				}
			} else {
				if (this.right != null) {
					this.right.add(num);
				} else {
					this.right = new preOrder(num);
				}
			}
		}
	}

	void preOrderTraversal() {
		System.out.println(this.data);
		if (this.left != null) {
			this.left.preOrderTraversal();
		}
		if (this.right != null) {
			this.right.preOrderTraversal();
		}
	}

	static int height(preOrder node) {
		if (node == null) {
			return -1;
		} else {
			int leftD = height(node.left);
			int rightD = height(node.right);
			if (leftD > rightD) {
				System.out.println(leftD + 1);
				return leftD + 1;
			} else {
				System.out.println(rightD + 1);
				return rightD + 1;
			}
		}
	}

	static void top_view(preOrder root) {
		if (root == null) {
			return;
		}
		if (root.left != null) {
			root.left.right = null;
			top_view(root.left);
		}
		System.out.println(root.data);

		if (root.right != null) {
			root.right.left = null;
			top_view(root.right);
		}
	}

	static int count = 0;

	static void level_order(preOrder root) {
		// TODO Auto-generated method stub

		if (root == null) {
			return;
		}

		if (count == 0) {
			System.out.println(root.data);
			count = 1;
		}

		if (root.left != null) {
			System.out.println(root.left.data);
		}
		if (root.right != null) {
			System.out.println(root.right.data);
		}
		level_order(root.left);
		level_order(root.right);
	}

	

	/*
	 * public void connectingTree(Node root) { if (root == null || (root.left ==
	 * null && root.right == null)) return; Queue<preOrder> queue = new
	 * LinkedList<preOrder>(); root.level = 1; queue.add(root); while
	 * (!(queue.isEmpty())) { Node temp = queue.remove(); temp.nextRight =
	 * (queue.peek() == null || queue.peek().level != temp.level) ? null :
	 * queue.peek(); if (temp.left != null) { temp.left.level = temp.level + 1;
	 * queue.add(temp.left); } if (temp.right != null) { temp.right.level =
	 * temp.level + 1; queue.add(temp.right); } } }
	 */

	/*void connect(preOrder node)
	{
		Queue<preOrder>q = new LinkedList<preOrder>();
		preOrder x = null,y;
		q.add(node);
		while(true){
			int nodecount=q.size();
			if(nodecount==0)
				break;
			while(nodecount-- >0)
			{
				x=q.remove();
				if(x.left != null)
					q.add(x.left);
				if(x.right != null)
					q.add(x.right);
				q.remove();
				if(!q.isEmpty())
				{
					y=q.peek();
					x.right=y;
				}
				System.out.println(x.data);
			}
			x.right=null;
		}
	}*/
	public static void counter(preOrder root, int low, int high, int count){
		if(root==null){
			return;
		}
		if(root.data<low){
			counter(root.left, low, high, count);
		}else if(root.data>high){
			counter(root.right, low, high, count);
		}else{
			count++;
			counter(root.left, low, high, count);
			counter(root.right, low, high, count);
		}
	}
	
	
	public static void main(String[] args) {

		preOrder tree = new preOrder(10);
		//int[] nums = { 1, 3, 2, 5, 4, 6, 7, 9, 8, 11, 13, 12, 10, 15, 14 };
		int[] nums = {5,50,1,40,100};
		for (int i : nums) {
			tree.add(i);
		}
			counter(tree, 1, 45, count);
			System.out.println(count);
		//tree.connect(tree);
		//tree.preOrderTraversal();
		
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println(height(tree));
		// top_view(tree);
		//level_order(tree);
		// findLevelLinkedList(tree);

	}

}
