package InternIntPractice;

import java.util.LinkedList;

public class detectLoopLL {
	
	Node head;
	public class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	public void push(int new_data)
	{
		Node newNode = new Node(new_data);
		newNode.next = head;
		head = newNode;
		
	}
	
	public static void main(String[] args)
	{
		detectLoopLL list = new detectLoopLL();
		list.push(25);
		list.push(4);
		list.push(15);
		list.push(10);
		list.head.next.next.next.next = list.head;
		list.detectLoop();
	}

	private int detectLoop() {
		// TODO Auto-generated method stub
		Node slow = head;
		Node fast = head;
		while(slow.next != null && fast.next != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast)
			{
				System.out.println("Found loop");
				return 1;
			}
		}
		return 0;
		
	}
	
}
