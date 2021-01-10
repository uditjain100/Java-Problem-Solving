package AssignmentsLinkedLists;

import AssignmentsLinkedLists.LinkedListR.Node;

public class KReverse {

	public static void main(String[] args) throws Exception {

		LinkedListR list = new LinkedListR();

		list.addlast(9);
		list.addlast(4);
		list.addlast(1);
		list.addlast(7);
		list.addlast(8);
		list.addlast(3);
		list.addlast(2);
		list.addlast(6);
		list.addlast(5);
		System.out.println(list.head.data);
		list.display();
		list.RD1(list, 3);
		list.display();
	}

	public void RD1(LinkedListR list, int k) throws Exception {

		for (int i = 0; i < list.size();) {
			int left = i;
			int right = i + k - 1;

			while (left < right) {

				Node ln = this.getNodeAt(left);
				Node rn = this.getNodeAt(right);

				System.out.println("{" + ln.data + " = " + rn.data + "}");
				int temp = ln.data;
				ln.data = rn.data;
				rn.data = temp;
				left++;
				right--;
			}
			i = i + k;
			System.out.print(i + "\t");
		}

	}
}
