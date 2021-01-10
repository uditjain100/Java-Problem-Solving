package AssignmentsGenericTree;

import Lecture19.GenericTree;

public class GenericTreeClientR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 110 3 20 2 50 0 60 0 30 0 40 1 70 0
		GenericTree gt = new GenericTree();

		gt.display();

		System.out.println("ABC");
		int a = gt.gr();
		System.out.println(a);
	}

}
