package AssignmentsDataStructures;

public class Stackcar {

	protected char[] data;
	protected int tos;

	public Stackcar() throws Exception {
		this.data = new char[5];
		this.tos = -1;
	}

	public Stackcar(int cap) throws Exception {
		if (cap < 1) {
			throw new Exception("Invalid Cap");
		}
		this.data = new char[cap];
		this.tos = -1;
	}

	public void push(char item) throws Exception {

		if (isFull()) {
			throw new Exception("Stack is Full");
		}

		tos++;
		this.data[this.tos] = item;
	}

	public char pop() throws Exception {

		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}

		char rv = this.data[this.tos];
		this.data[this.tos] = 0;
		tos--;
		return rv;
	}

	public char top() throws Exception {

		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}

		char rv = this.data[this.tos];
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
