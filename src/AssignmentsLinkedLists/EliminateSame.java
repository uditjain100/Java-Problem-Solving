package AssignmentsLinkedLists;

public class EliminateSame {

	public static void main(String[] args) throws Exception {

		LinkedListR list = new LinkedListR();

		list.addlast(10);
		list.addlast(30);
		list.addlast(30);
		list.addlast(20);
		list.addlast(20);
		list.addlast(100);
		list.addlast(20);
		list.addlast(30);
		list.addlast(30);
		list.addlast(50);
		list.addlast(30);
		System.out.println(list.getAt(0));
		list.display();
		list.RD2(list);
		list.display();
	}

	public void RD2(LinkedListR list) throws Exception {

		for (int i = 0; i < list.size(); i++) {

			int a = list.getAt(i);
			System.out.print(" i - (" + i + ") - " + a);
			for (int j = i + 1; j < list.size();) {
				System.out.print(" j - (" + j + ") - " + list.getAt(j));
				if (a == list.getAt(j)) {
					int b = list.removeAt(j);
					System.out.print(" b - (" + b + ")");
					System.out.println();
				} else {
					j++;
				}
				System.out.println();
				list.display();
			}
			System.out.println();

		}

	}

}
