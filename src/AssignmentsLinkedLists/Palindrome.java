package AssignmentsLinkedLists;

public class Palindrome {

	public static void main(String[] args) throws Exception {

		LinkedListR list = new LinkedListR();

		list.addlast(10);
		list.addlast(30);
		list.addlast(20);
		list.addlast(30);
		list.addlast(30);
		list.addlast(10);
		list.display();
		System.out.println(list.RD2(list));
	}

	public boolean RD2(LinkedListR list) throws Exception {

		int left = 0;
		int right = list.size() - 1;

		while (left < right) {

			if (list.getAt(left) != list.getAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;

	}
}
