package AssignmentsLinkedLists;

import AssignmentsLinkedLists.LinkedListR.Node;

public class Swap {

	public static void main(String[] args) throws Exception {

		LinkedListR list = new LinkedListR();

		list.addlast(1);
		list.addlast(2);
		list.addlast(3);
		list.addlast(4);
		list.addlast(5);
		list.display();
		list.RD1(list, 5, 4);
		list.display();
	}

	public void RD1(LinkedListR list, int a, int b) throws Exception {

		Node nn = this.head;
		Node a1 = new Node();
		Node b1 = new Node();

		for (int i = 0; i < list.size(); i++) {

			if (nn.data == a) {
				a1 = this.getNodeAt(i);
			} else if (b == nn.data) {
				b1 = this.getNodeAt(i);
			}
			nn = nn.next;
		}
		int temp = a1.data;
		a1.data = b1.data;
		b1.data = temp;
	}

}
