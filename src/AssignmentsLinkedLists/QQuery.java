package AssignmentsLinkedLists;

public class QQuery {

	public static void main(String[] args) throws Exception {

		LinkedListR list = new LinkedListR();

		list.addlast(1);
		list.addlast(2);
		list.addlast(3);
		list.addlast(4);
		list.addlast(5);
		list.display();
		list.RD2(list, 0);
		list.display();
		list.RD2(list, 1);
		list.display();

	}

	public void RD2(LinkedListR list, int k) throws Exception {

		list.removeAt(k);

	}
}
