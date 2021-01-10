package AssignmentsLinkedLists;

public class KAppend {

	public static void main(String[] args) throws Exception {

		LinkedListR list = new LinkedListR();

		list.addlast(1);
		list.addlast(2);
		list.addlast(2);
		list.addlast(1);
		list.addlast(8);
		list.addlast(5);
		list.addlast(6);
		list.display();
		list.RD1(list, 3);
		list.display();

	}

	public void RD2(LinkedListR list, int k) throws Exception {

		LinkedListR list2 = new LinkedListR();

		for (int i = list.size() - 1; i > list.size() - k - 1; i--) {
			list2.addFirst(list.getAt(i));
		}
		list2.display();
		for (int i = 0; i < list.size() - k; i++) {
			list2.addlast(list.getAt(i));
		}
		list2.display();

	}

	public void RD1(LinkedListR list, int k) throws Exception {

		LinkedListR list2 = new LinkedListR();

		while (k != 0) {
			int a = list.getAt(list.size() - 1);
			list.removeAt(list.size() - 1);
			list.addFirst(a);
			k--;
		}
	}
}
