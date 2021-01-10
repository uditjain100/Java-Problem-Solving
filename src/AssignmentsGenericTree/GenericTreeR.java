package AssignmentsGenericTree;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;

public class GenericTreeR {

	Scanner scn = new Scanner(System.in);

	public class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private Node root;

	public void GenericTreeR() {
		this.root = takeinput(null, -1);
	}

	public Node takeinput(Node parent, int ith) {

		if (parent == null) {
			System.out.println("Give the data for parent node");
		} else {
			System.out.println("Give the data for " + ith + " ith child for " + parent.data + " parent node ");
		}

		int item = scn.nextInt();
		Node nn = new Node();
		nn.data = item;

		System.out.println("Give the number of children");
		int n = scn.nextInt();

		for (int i = 0; i < n; i++) {
			Node abc = takeinput(nn, i);
			nn.children.add(abc);
		}
		return nn;
	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {

		String str = node.data + "->";
		for (Node child : node.children) {
			str += child.data + " ";
		}
		System.out.println(str);
		for (Node child : node.children) {
			display(child);
		}

	}

	public void size() {
		System.out.println("-----------");
		System.out.println(size(this.root));
		System.out.println("-----------");
	}

	private int size(Node node) {

		int tc = 0;
		for (Node child : node.children) {
			int cs = size(child);
			tc += cs;
		}
		return tc + 1;
	}

	public void max() {
		System.out.println(max(this.root));
	}

	private int max(Node node) {

		int max = node.data;
		for (Node child : node.children) {
			int sm = size(child);
			if (sm > max) {
				max = sm;
			}
		}
		return max;
	}

	public void find() {
		int item = scn.nextInt();
		System.out.println(find(this.root, item));
	}

	private boolean find(Node node, int item) {

		if (node.data == item) {
			return true;
		}
		for (Node child : node.children) {
			boolean sm = find(child, item);
			if (sm) {
				return true;
			}
		}
		return false;
	}

	public void ht() {
		System.out.println(ht(this.root));
	}

	private int ht(Node node) {

		int mht = -1;
		for (Node child : node.children) {
			int sht = size(child);
			if (sht > mht) {
				mht = sht;
			}
		}
		return mht + 1;
	}

	public void sum() {
		System.out.println(sum(this.root));
	}

	private int sum(Node node) {

		int sum = 0;
		for (Node child : node.children) {
			int data1 = size(child);
			sum += data1;
		}
		return sum;
	}
}
