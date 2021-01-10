package AssignmentsLinkedLists;

import AssignmentsLinkedLists.LinkedListR.Node;

public class KthElementLast {

	public static void main(String[] args) throws Exception {

		LinkedListR list = new LinkedListR();

		list.addlast(1);
		list.addlast(2);
		list.addlast(3);
		list.addlast(4);
		list.addlast(5);
		list.addlast(6);
		list.addlast(-1);
		list.display();
		list.RD2(list, 3);
		list.display();

	}

	public void RD2(LinkedListR list, int k) throws Exception {

		// last - k + 1
		System.out.println(list.getAt(list.size() - k - 1));

		Node slow = this.head;
		Node fast = this.head;

		for (int i = 1; i <= k + 1; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		System.out.println(slow.data);
	}
}
