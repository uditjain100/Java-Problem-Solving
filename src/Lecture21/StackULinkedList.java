package Lecture21;

import Lecture16.LinkedList;

public class StackULinkedList {

	LinkedList primary = new LinkedList();

	public void push(int item) throws Exception {

		try {
			primary.addfirst(item);
		} catch (Exception e) {
			throw new Exception("Stack is Full");
		}
	}

	public int pop() throws Exception {

		try {
			int rv = primary.removefirst();
			return rv;

		} catch (Exception e) {
			throw new Exception("Stack is Empty");

		}

	}

	public int top() throws Exception {

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
