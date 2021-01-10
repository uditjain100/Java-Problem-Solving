package Lecture16;

public class LinkedList {

	public class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	public int size;

	public int getfirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is Empty");
		}
		return this.head.data;
	}

	public int getlast() throws Exception {
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

	public int getAt(int a) throws Exception {
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

	public void addLast(int item) {
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

	public void addfirst(int item) {
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
		Node temp = this.head;
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

	public int removefirst() throws Exception {
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

	public int removelast() throws Exception {
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

	public int removeAt(int a) throws Exception {

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

	public int mid() {
		Node slow = this.head;
		Node fast = this.head;

		while (fast.next != null && slow.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public void reverseDI() throws Exception {

		int left = 0;
		int right = this.size - 1;
		while (left < right) {
			Node l = getNodeAt(left);
			Node r = getNodeAt(right);
			int temp = l.data;
			l.data = r.data;
			r.data = temp;
			left++;
			right--;
		}
		// System.out.println();
	}

	public void reversePI() throws Exception {

		Node prev = this.head;
		Node curr = prev.next;

		while (curr != null) {
			Node ahead = curr.next;
			curr.next = prev;

			prev = curr;
			curr = ahead;
		}
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		tail.next = null;
	}

	public void reversePR() {
		reversePR(this.head, this.head.next);

		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		tail.next = null;

	}

	private void reversePR(Node prev, Node curr) {
		if (curr == null) {
			return;
		}

		reversePR(curr, curr.next);
		curr.next = prev;
	}

	private Node reverseDR(Node left, Node right, int count) {
		if (right == null) {
			return left;
		}

		left = reverseDR(left, right.next, count + 1);
		if (count >= (this.size) / 2) {
			int temp = left.data;
			left.data = right.data;
			right.data = temp;
		}
		return left.next;
	}

	private class Heapmover {

		Node left;
	}

	public void reverseDRHeap1() {

		Heapmover mover = new Heapmover();
		mover.left = this.head;
		reverseDRHeap(mover, this.head.next, 0);

	}

	private void reverseDRHeap(Heapmover mover, Node right, int count) {
		if (right == null) {
			return;
		}
		reverseDRHeap(mover, right.next, count + 1);
		if (count >= (this.size) / 2) {
			int temp = mover.left.data;
			mover.left.data = right.data;
			right.data = temp;
		}
		mover.left = mover.left.next;
	}

	public void fold() {

		Heapmover mover = new Heapmover();
		mover.left = this.head;
		fold(mover, this.head, 0);

	}

	private void fold(Heapmover mover, Node right, int count) {
		if (right == null) {
			return;
		}

		fold(mover, right.next, count + 1);
		if (count > (this.size) / 2) {

			Node ahead = mover.left.next;

			mover.left.next = right;
			right.next = ahead;

			mover.left = ahead;

		}

		if (count == this.size / 2) {
			this.tail = right;
			this.tail.next = null;
		}
	}

	public int kthfromlast(int k) {

		Node slow = this.head;
		Node fast = this.head;

		for (int i = 1; i <= k; i++) {
			fast = fast.next;
		}
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;
	}
}
