package Lecture21;

import Lecture15.DynamicQueue;

public class StackUQueuePop {

	DynamicQueue primary = new DynamicQueue();

	public void push(int item) throws Exception {
		try {
			DynamicQueue helper = new DynamicQueue();
			helper.enqueue(item);
			while (primary.size() != 0) {
				int rv = primary.dequeue();
				helper.enqueue(rv);
			}
			primary = helper;

		} catch (Exception e) {
			throw new Exception("Stack is Full");
		}
	}

	public int pop() throws Exception {

		try {

			int rv = primary.dequeue();
			return rv;

		} catch (Exception e) {
			throw new Exception("Stack is Empty");

		}
	}

	public int top() throws Exception {

		try {

			int rv = primary.getfront();
			return rv;

		} catch (Exception e) {
			throw new Exception("Stack is Empty");

		}
	}

	public int size() {
		return primary.size();
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void display() {

		primary.display();

	}

}
