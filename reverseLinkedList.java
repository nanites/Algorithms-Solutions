package InternIntPractice;

public class reverseLinkedList {
	static Node head;

	public class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void reverse() {
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	public void push(int d) {
		Node newNode = new Node(d);
		newNode.next = head;
		head = newNode;
	}

	public static void main(String[] args) {
		reverseLinkedList list = new reverseLinkedList();
		list.push(25);
		list.push(4);
		list.push(15);
		list.push(10);
		reverse();
		display();

	}

	private static void display() {

		Node temp;
		temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}


	}
}
