package Lecture21;

import Lecture16.LinkedList;

public class QueueULinkedList {

	LinkedList primary = new LinkedList();

	public void enqueue(int item) throws Exception {

		try {
			primary.addLast(item);
		} catch (Exception e) {
			throw new Exception("Stack is Full");
		}
	}

	public int dequeue() throws Exception {

		try {
			int rv = primary.removefirst();
			return rv;

		} catch (Exception e) {
			throw new Exception("Stack is Empty");

		}

	}

	public int getfront() throws Exception {

		try {
			int rv = primary.getfirst();
			return rv;
		} catch (Exception e) {
			throw new Exception("Stack is Empty");

		}

	}

	public int size() {
		return primary.size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void display() throws Exception {

		primary.display();

	}

}
