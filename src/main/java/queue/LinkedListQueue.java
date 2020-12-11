package queue;

public class LinkedListQueue {
	
	class Node {
		Node prev;
		Node next;
		public Object data;
	}
	
	private Node head, tail = null;
	
	private int size;
	
	public <T> void enqueue(Object data) {
		
		// increase size of queue
		size++;
		
		Node newNode = new Node();
		newNode.data = data;
		
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		
		else {
			
			// point newNode.prev to previously last node
			newNode.prev = tail;
			
			// update tail
			tail = newNode;
			tail.prev = newNode.prev;
			
			if (size == 2) {
				head.next = newNode;
			}
			
		}
	}
	
	public void dequeue() {
		if (head == null) {
			System.out.println("Queue is empty");
			return;
		}
		
		else {
			head = head.next;
			head.prev = null;
			size --;
		}
		
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		
		else {
			return false;
		}
	}

}
