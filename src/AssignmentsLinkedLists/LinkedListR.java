package AssignmentsLinkedLists;

import java.util.Scanner;

public class LinkedListR {

	public class Node {
		int data;
		Node next;
	}

	Node head;
	Node tail;
	int size;

	public void display() {

		Node temp = this.head;
		System.out.println("-----------------");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		System.out.println("-----------------");
	}

	int size() {
		return this.size;
	}

	public void addlast(int item) {

		// new node creation
		Node nn = new Node();

		nn.data = item;
		nn.next = null;

		// Attachment
		if (this.size >= 1) {
			this.tail.next = nn;
		}

		// summary object
		if (this.size == 0) {
 			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
			this.size++;
		}

	}

	public void addFirst(int item) {

		Node nn = new Node();

		nn.data = item;
		nn.next = null;

		if (this.size >= 1) {
			nn.next = head;
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

	public int getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List Is Empty.");
		}
		return this.head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List Is Empty.");
		}
		return this.tail.data;
	}

	public int getAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List Is Empty.");
		}
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index.");
		}
		Node temp = this.head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	private Node getNodeAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List Is Empty.");
		}
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index.");
		}
		Node temp = this.head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addAt(int idx, int item) throws Exception {

		if (idx < 0 || idx > this.size) {
			throw new Exception("Invalid Index.");
		}

		if (idx == 0) {
			this.addFirst(item);
		} else if (this.size == idx) {
			this.addlast(item);
		} else {
			Node nn = new Node();

			nn.data = item;
			nn.next = null;

			Node nm1 = this.getNodeAt(idx - 1);
			Node np1 = nm1.next;

			nm1.next = nn;
			nn.next = np1;
			this.size++;
		}

	}

	public int removeFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("Linked List Is Empty.");
		}

		int rv = this.head.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;
		}
		return rv;
	}

	public int removeLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("Linked List Is Empty.");
		}

		int rv = this.tail.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node nm1 = this.getNodeAt(this.size - 2);
			nm1.next = null;
			this.size--;
		}
		return rv;
	}

	public int removeAt(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("Linked List Is Empty.");
		}

		if (idx < 0 || idx > this.size) {
			throw new Exception("Invalid Index.");
		}

		Node nn = this.getNodeAt(idx);
		int rv = nn.data;
		if (idx == 0) {
			return this.removeFirst();
		} else if (idx == this.size - 1) {
			return this.removeLast();
		} else {
			Node nm1 = this.getNodeAt(idx - 1);
			Node np1 = this.getNodeAt(idx + 1);
			nm1.next = np1;
			this.size--;
		}
		return rv;
	}

	public void reverse() throws Exception {

		int left = 0;
		int right = this.size - 1;

		while (left < right) {

			Node ln = this.getNodeAt(left);
			Node rn = this.getNodeAt(right);

			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;
			left++;
			right--;
		}
	}

	public void reverseP() throws Exception {

		Node pre = this.head;
		Node curr = pre.next;

		while (curr != null) {

			Node ahead = curr.next;
			curr.next = pre;

			pre = curr;
			curr = ahead;
		}
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;

		this.tail.next = null;
	}

	public static void main(String[] args) throws Exception {

		LinkedListR list = new LinkedListR();

		
		list.addlast(1);
		list.addlast(2);
		list.addlast(2);
		list.addlast(3);
		list.addlast(8);
		list.addlast(5);
		list.addlast(6);
		list.display();
		System.out.println(list.Kelefromlast(3));
		list.display();
	}

	public void removedup() throws Exception {

		Node temp = this.head;

		for (int i = 0; i < this.size - 1;) {

			Node n1 = getNodeAt(i);
			Node n2 = getNodeAt(i + 1);
			if (n1.data == n2.data) {
				removeAt(i + 1);
			} else {
				i++;
			}

		}

	}

	public void kReverse(int k) throws Exception {

		for (int i = 0; i < this.size; i += k) {

			int left = i;
			int right = i + k - 1;
			while (left <= right) {

				Node l = getNodeAt(left);
				Node r = getNodeAt(right);

				int temp = l.data;
				l.data = r.data;
				r.data = temp;

				left++;
				right--;
			}

		}

	}

	public void swaptwoele(int num1, int num2) throws Exception {

		int idx1 = 0;
		int idx2 = 0;
		for (int i = 0; i < this.size; i++) {

			if (num1 == getAt(i)) {
				idx1 = i;
			}

			if (num2 == getAt(i)) {
				idx2 = i;
			}

		}

		Node a = getNodeAt(idx1);
		Node b = getNodeAt(idx2);

		int temp = a.data;
		a.data = b.data;
		b.data = temp;

	}

	public void eliminatedup() throws Exception {

		Node temp = this.head;

		for (int i = 0; i < this.size - 1;) {

			Node n1 = getNodeAt(i);
			Node n2 = getNodeAt(i + 1);
			if (n1.data == n2.data) {
				removeAt(i + 1);
			} else {
				i++;
			}

		}

	}

	public void midpoint() throws Exception {

		Node slow = this.head;
		Node fast = this.head;

		while (fast.next != null && slow.next != null) {

			fast = fast.next.next;
			slow = slow.next;

		}

		System.out.println(slow.data);

	}

	public boolean ispalindrome() throws Exception {

		int left = 0;
		int right = this.size - 1;

		while (left <= right) {

			int a = getAt(left);
			int b = getAt(right);

			if (a != b) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public void evenodd() throws Exception {

		LinkedListR list = new LinkedListR();

		for (int i = 0; i < this.size; i++) {

			if (getAt(i) % 2 == 1) {
				list.addlast(getAt(i));
			}

		}

		for (int i = 0; i < this.size; i++) {

			if (getAt(i) % 2 == 0) {
				list.addlast(getAt(i));
			}

		}

		for (int i = 0; i < this.size; i++) {

			Node temp = getNodeAt(i);
			temp.data = list.getAt(i);

		}

	}

	public void Kappend(int n) throws Exception {

		LinkedListR list = new LinkedListR();

		for (int i = this.size - n; i < this.size; i++) {
			list.addlast(getAt(i));
		}

		for (int i = 0; i < this.size - n; i++) {
			list.addlast(getAt(i));
		}

		for (int i = 0; i < this.size; i++) {

			Node nn = getNodeAt(i);

			nn.data = list.getAt(i);
		}
	}

	public void Qquery(LinkedListR list, int[] arr) throws Exception {

		for (int i = 0; i < arr.length; i++) {

			removeAt(arr[i]);
			list.display();

		}

	}

	public int Kelefromlast(int n) throws Exception {

		Node fast = this.head;
		Node slow = this.head;

		for (int i = 0; i <= n; i++) {
			fast = fast.next;
		}

		while (fast != null && slow != null) {

			fast = fast.next;
			slow = slow.next;

		}

		return slow.data;
	}

	public void Kappend2(int n) throws Exception {

		Node n1 = getNodeAt(this.size - n);
		Node n2 = getNodeAt(this.size - n - 1);

		this.tail.next = this.head;
		this.head = n1;
		this.tail = n2;

		this.tail.next = null;
	}
}
