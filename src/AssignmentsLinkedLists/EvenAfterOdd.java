package AssignmentsLinkedLists;

import AssignmentsLinkedLists.LinkedListR.Node;

public class EvenAfterOdd {

	public static void main(String[] args) throws Exception {

		LinkedListR list = new LinkedListR();

		list.addlast(1);
		list.addlast(2);
		list.addlast(2);
		list.addlast(2);
		list.addlast(1);
		list.addlast(1);
		list.display();
		list.RD1(list);
		list.display();

	}

	public void RD2(LinkedListR list) throws Exception {

		LinkedListR list2 = new LinkedListR();

		Node nn = this.head;
		for (int i = 0; i < list.size(); i++) {

			if (nn.data % 2 == 0) {
				list2.addlast(nn.data);
			} else {
				list2.addFirst(nn.data);
			}
			nn = nn.next;
		}
		list2.display();

	}

	public void RD1(LinkedListR list) throws Exception {

		int size = list.size();
		Node nn = this.head;
		for (int i = 0; i < list.size();) {

			System.out.print(" i - (" + i + ") - " + list.getAt(i));

			int a = 0;
			if (nn.data % 2 == 0) {
				a = list.removeAt(i);
				System.out.println(" " + a);
			} else {
				i++;
			}
			if (i <= size) {
				list.addlast(a);
			}
			nn = nn.next;
			System.out.println(" size - " + list.size());
		}
		System.out.println();

	}
}
