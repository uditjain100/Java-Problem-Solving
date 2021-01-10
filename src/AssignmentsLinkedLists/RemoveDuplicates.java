package AssignmentsLinkedLists;

import AssignmentsLinkedLists.LinkedListR.Node;

public class RemoveDuplicates {

	public static void main(String[] args) throws Exception {

		LinkedListR list = new LinkedListR();

		list.addlast(1);
		list.addlast(1);
		list.addlast(2);
		list.addlast(2);
		list.addlast(3);
		list.addlast(3);
		list.addlast(5);
		list.addlast(5);
		list.addlast(6);
		list.addlast(6);
		list.addlast(7);
		list.addlast(7);
		list.display();
		list.RD1(list);
	}

	public void RD1(LinkedListR list) throws Exception {

		LinkedListR list2 = new LinkedListR();

		Node nn = this.head;
		for (int i = 0; i < this.size();) {
			if (nn.data == nn.next.data) {
				list2.addlast(nn.data);
				i += 2;
				nn = nn.next.next;
			} else {
				list2.addlast(nn.data);
				i++;
				nn = nn.next;
			}
		}
		list2.display();
	}
}
