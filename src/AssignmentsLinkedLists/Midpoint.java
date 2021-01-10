package AssignmentsLinkedLists;

import AssignmentsLinkedLists.LinkedListR.Node;

public class Midpoint {

	public static void main(String[] args) throws Exception {

		LinkedListR list = new LinkedListR();

		list.addlast(10);
		list.addlast(30);
		list.addlast(20);
		list.addlast(200);
		list.addlast(100);
		list.addlast(50);
		list.display();
		list.RD2(list);
	}

	public void RD2(LinkedListR list) throws Exception {

		Node slow = this.head;
		Node fast = this.head;

		for (int i = 0; i < list.size() / 2; i++) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);
	}

}
