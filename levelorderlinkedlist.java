package InternIntPractice;

import java.util.*;

//Java program to connect nodes at same level using extended
//pre-order traversal

//A binary tree node
class Node {
	int data;
	Node left, right, next;

	Node(int item) {
		data = item;
		left = right = next = null;
	}
}

class levelorderlinkedlist {
	Node root;

	// Sets the nextRight of root and calls connectRecur() for other nodes
	public void connectNodes(Node n) {
		Queue<Node> q1 = new LinkedList<Node>();
		Queue<Node> q2 = new LinkedList<Node>();
		q1.add(root);

		while (!q1.isEmpty() || !q2.isEmpty()) {
			while (!q1.isEmpty()) {
				root = q1.poll();
				System.out.print(root.data + " ");
				if (root.left != null) {
					q2.add(root.left);
				}
				if (root.right != null) {
					q2.add(root.right);
				}
			}
			System.out.println();
			while(!q2.isEmpty()){
				root = q2.poll();
				System.out.print(root.data + " ");
				if (root.left != null) {
					q1.add(root.left);
				}
				if (root.right != null) {
					q1.add(root.right);
				}
			}
			System.out.println();
		}

	}

	// Driver program to test above functions
	public static void main(String args[]) {
		levelorderlinkedlist tree = new levelorderlinkedlist();

		/*
		 * Constructed binary tree is 10 / \ 8 2 / 3
		 */
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.right.right = new Node(15);

		tree.connectNodes(tree.root);

	}
}
