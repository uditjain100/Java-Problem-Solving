package AssignmentsDataStructures;

public class StackR {

	protected int[] data;
	protected int tos;

	public StackR() throws Exception {
		this.data = new int[5];
		this.tos = -1;
	}

	public StackR(int cap) throws Exception {
		if (cap < 1) {
			throw new Exception("Invalid Cap");
		}
		this.data = new int[cap];
		this.tos = -1;
	}

	public void push(int item) throws Exception {

		if (isFull()) {
			throw new Exception("Stack is Full");
		}

		tos++;
		this.data[this.tos] = item;
	}

	public int pop() throws Exception {

		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}

		int rv = this.data[this.tos];
		this.data[this.tos] = 0;
		tos--;
		return rv;
	}

	public int top() throws Exception {

		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}

		int rv = this.data[this.tos];
		return rv;
	}

	public boolean isFull() {
		return this.size() == this.data.length;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public int size() {
		return this.tos + 1;
	}

	public void display() {

		for (int i = this.tos; i >= 0; i--) {
			System.out.print(this.data[i] + "\t");
		}
	}
}
