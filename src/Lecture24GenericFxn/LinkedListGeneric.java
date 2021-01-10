package Lecture24GenericFxn;

public class LinkedListGeneric<T> {

	public class Node {
		T data;
		Node next;
	}

	private Node head;
	private Node tail;
	public int size;

	public T getfirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}
		return this.head.data;
	}

	public T getlast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}
		return this.tail.data;
	}

	int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public T getAt(int a) throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}
		if (a < 0 || a >= this.size) {
			throw new Exception("Invalid Index");
		}
		Node temp = head;
		for (int i = 0; i < a; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	public void addLast(T item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		if (this.size > 0) {
			this.tail.next = nn;
		}
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
			this.size++;
		}
	}

	public void addfirst(T item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		if (this.size > 0) {
			nn.next = this.head;
		}
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.head = nn;
			this.size++;
		}

	}

	private Node getNodeAt(int a) throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}
		if (a < 0 || a >= this.size) {
			throw new Exception("Invalid Index");
		}
		Node temp = head;
		for (int i = 0; i < a; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addAt(int item, int a) throws Exception {

		if (a < 0 || a > this.size) {
			throw new Exception("Invalid Index");
		}

		if (a == 0) {
			addfirst(item);
		} else if (this.size == a) {
			addLast(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			Node prev = getNodeAt(a - 1);
			Node ahead = getNodeAt(a);

			prev.next = nn;
			nn.next = ahead;
			this.size++;
		}

	}

	public T removefirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}
		Node temp = this.head;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;
		}
		return temp.data;
	}

	public T removelast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}
		Node temp = this.tail;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node b = getNodeAt(this.size - 2);
			b.next = null;
			this.tail = b;
			this.size--;
		}
		return temp.data;
	}

	public T removeAt(int a) throws Exception {

		if (this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}
		if (a < 0 || a >= this.size) {
			throw new Exception("Invalid Index");
		}

		if (a == 0) {
			return removefirst();
		} else if (this.size == a) {
			return removelast();
		} else {
			Node prev = getNodeAt(a - 1);
			Node self = getNodeAt(a);
			Node ahead = getNodeAt(a + 1);

			prev.next = ahead;
			this.size--;
			return self.data;
		}
	}

}
