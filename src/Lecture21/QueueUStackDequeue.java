package Lecture21;

import Lecture15.DynamicStack;

public class QueueUStackDequeue {

	DynamicStack primary = new DynamicStack();

	public void enqueue(int item) throws Exception {

		try {
			DynamicStack helper = new DynamicStack();
			while (primary.size() != 0) {
				int client = primary.pop();
				helper.push(client);
			}
			primary.push(item);
			while (helper.size() != 0) {
				int client = helper.pop();
				primary.push(client);
			}
		} catch (Exception e) {
			throw new Exception("Queue is Full");
		}
	}

	public int dequeue() throws Exception {

		try {
			int rv = primary.pop();
			return rv;
		} catch (Exception e) {
			throw new Exception("Queue is Empty");
		}
	}

	public int getFront() throws Exception {

		try {

			int rv = primary.pop();
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

		primary.display();
	}

}
