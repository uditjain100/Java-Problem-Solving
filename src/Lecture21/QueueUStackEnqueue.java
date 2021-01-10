package Lecture21;

import Lecture15.DynamicStack;

public class QueueUStackEnqueue {

	DynamicStack primary = new DynamicStack();

	public void enqueue(int item) throws Exception {

		try {
			primary.push(item);
		} catch (Exception e) {
			throw new Exception("Queue is Full");
		}
	}

	public int dequeue() throws Exception {

		try {
			DynamicStack helper = new DynamicStack();
			while (primary.size() != 1) {
				int client = primary.pop();
				helper.push(client);
			}
			int rv = primary.pop();
			while (helper.size() != 0) {
				int client = helper.pop();
				primary.push(client);
			}
			return rv;
		} catch (Exception e) {
			throw new Exception("Queue is Empty");

		}

	}

	public int getFront() throws Exception {

		try {
			DynamicStack helper = new DynamicStack();
			while (primary.size() != 1) {
				int client = primary.pop();
				helper.push(client);
			}
			int rv = primary.pop();
			helper.push(rv);
			while (helper.size() != 0) {
				int client = helper.pop();
				primary.push(client);
			}
			return rv;
		} catch (Exception e) {
			throw new Exception("Queue is Empty");

		}

	}

	public int size() {
		return primary.size();
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void display() throws Exception {
		System.out.println("---------");
		display1();
		System.out.println("---------");
	}

	private void display1() throws Exception {

		if (primary.isEmpty()) {
			return;
		}
		int temp = primary.pop();
		display1();
		System.out.println(temp);
		primary.push(temp);

	}

}
