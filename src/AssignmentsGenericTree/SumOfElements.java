package AssignmentsGenericTree;

import Lecture19.GenericTree.Node;

public class SumOfElements {

	public void sum() {
		System.out.println(sum(this.root));
	}

	private int sum(Node node) {

		int sum = node.data;
		for (Node child : node.children) {
			int data1 = sum(child);
			sum += data1;
		}
		return sum;
	}
}
