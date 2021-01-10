package AssignmentsBinaryTree;

import java.util.Scanner;

public class BinaryTreeR {

	public class Node {

		int data;
		Node left;
		Node right;

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;

		}
	}

	private Node root = null;
	private int size = 0;

	BinaryTreeR() {

		Scanner scn = new Scanner(System.in);
		this.root = takeinput(scn, null, false);
	}

	public Node takeinput(Scanner scn, Node parent, boolean ilc) {

		if (parent == null) {
			System.out.println("Write the data for root node");
		} else {
			if (ilc) {
				System.out.println("Write the data for left node");
			} else {
				System.out.println("Write the data for right Node");
			}
		}

		int item = scn.nextInt();
		Node node = new Node(item, null, null);
		this.size++;

		boolean choice = false;
		System.out.println("Is left child exist for " + node.data);
		choice = scn.nextBoolean();

		if (choice) {
			node.left = takeinput(scn, node, true);
		}

		choice = false;
		System.out.println("Is right child exist for " + node.data);
		choice = scn.nextBoolean();

		if (choice) {
			node.right = takeinput(scn, node, false);
		}

		return node;
	}

	public void display() {

		display(this.root);

	}

	private void display(Node node) {

		String str = "";
		if (node.left != null) {
			str += node.left.data + " => ";
		} else {
			str += "END => ";
		}

		str = str + node.data;

		if (node.right != null) {
			str += " <= " + node.right.data;
		} else {
			str += " <= END";
		}

		System.out.println(str);

		if (node.left != null) {
			display(node.left);
		}

		if (node.right != null) {
			display(node.right);
		}
	}

	public void ht() {
		int a = ht(this.root);
		System.out.println(a);
	}

	private int ht(Node node) {

		if (node == null) {
			return -1;
		}

		int left = ht(node.left);
		int right = ht(node.right);

		int max = Math.max(left, right);

		return max;
	}
}
