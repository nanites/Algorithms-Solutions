package InternIntPractice;

import java.util.*;

public class LRU {

	int size, head, tail, q[];
	
	public LRU(int s) {
		// TODO Auto-generated constructor stub
		size = s;
		head = 0;
		tail = 0;
		q = new int[s];
	}
	
	boolean enqueue(int v){
		int tmp = (tail+1)%size;
		/*if(tmp == head){
			return false;
		}*/
		q[tail] = v;
		tail = tmp;
		return true;
	}
	
	int dequeue(){
		if(head == tail){
			System.out.println("Queue underflow");
		}
		int temp = q[head];
		head = (head + 1) % size;
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRU circularQueue = new LRU(5);
		Set<Integer> set = new HashSet<Integer>();
		
		if(set.contains(1)){
			circularQueue.enqueue(1);
		}
		
		set.add(2);
		circularQueue.enqueue(2);
		
		set.add(3);
		circularQueue.enqueue(3);
		
		set.add(4);
		circularQueue.enqueue(4);
		
		set.add(5);
		circularQueue.enqueue(5);
		
		set.add(6);
		circularQueue.enqueue(6);
		
	}

}
