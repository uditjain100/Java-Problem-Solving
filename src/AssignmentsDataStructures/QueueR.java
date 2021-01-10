package AssignmentsDataStructures;

public class QueueR {

	protected int[] data;
	protected int size;
	protected int front;

	public QueueR() {

		this.data = new int[5];
		this.size = 0;
		this.front = 0;
	}

	public QueueR(int cap) throws Exception {

		if (cap < 1) {
			throw new Exception("Invalid Capacity");
		}
		this.data = new int[cap];
		this.size = 0;
		this.front = 0;
	}

	public boolean isFull() {
		return this.size() == this.data.length;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public int size() {
		return this.size;
	}

	public void enqueue(int item) throws Exception {

		if (isFull()) {
			throw new Exception("Queue is Full");
		}

		int ai = (this.front + this.size) % this.data.length;
		this.data[ai] = item;
		this.size++;
	}

	public int dequeue() throws Exception {

		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}

		int rv = this.data[this.front];
		this.data[this.front] = 0;
		this.front = (this.front + 1) % this.data.length;
		this.size--;
		return rv;
	}

	public int getFront() throws Exception {

		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}

		int rv = this.data[this.front];
		return rv;
	}

	public void display() {

		System.out.println("**********");
		for (int i = 0; i < this.size; i++) {
			int ai = (this.front + i) % this.data.length;
			System.out.print(this.data[ai] + " ");
		}
		System.out.println();
		System.out.println("**********");
	}

}
