package Lecture19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import AssignmentsGenericTree.GenericTreeR.Node;
import Lecture15.Queue;

public class GenericTree {

	Scanner scn = new Scanner(System.in);

	public class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private Node root;

	public GenericTree() {
		this.root = takeInput(null, -1);
	}

	private Node takeInput(Node parent, int ith) {

		if (parent == null) {
			System.out.println("Give the data for root node");
		} else {
			System.out.println("Give the data for " + ith + " child of " + parent.data);
		}

		int item = scn.nextInt();
		Node nn = new Node();
		nn.data = item;

		System.out.println("Give the no of children");
		int noc = scn.nextInt();

		for (int i = 0; i < noc; i++) {
			Node abc = takeInput(nn, i);
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
		System.out.println("---------------");
		System.out.println(size(this.root));
		System.out.println("---------------");
	}

	private int size(Node node) {

		int ts = 0;
		for (Node child : node.children) {
			int cs = size(child);
			ts += cs;
		}
		return ts + 1;
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {

		int a = node.data;
		for (Node child : node.children) {
			int b = max(child);
			if (b > a) {
				a = b;
			}
		}
		return a;
	}

	public int gr() {
		int n = scn.nextInt();
		ArrayList<Integer> ans = gr(this.root, n);
		System.out.println(ans);
		int min = min(ans);
		return min;
	}

	private ArrayList<Integer> gr(Node node, int n) {
		int a = node.data;
		ArrayList<Integer> b = new ArrayList<>();
		if (a > n) {
			b.add(a);
		}
		for (Node child : node.children) {
			b = gr(child, n);
			if (child.data > n) {
				b.add(child.data);
			}
		}
		return b;
	}

	public int min(ArrayList<Integer> ans) {

		if (ans.size() == 0) {
			return -1;
		}
		int min = Collections.min(ans);

		return min;
	}

	public boolean find() {
		int item = scn.nextInt();
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		if (node.data == item) {
			return true;
		}
		for (Node child : node.children) {
			boolean cf = find(child, item);
			if (cf) {
				return true;
			}

		}
		return false;
	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {
		int th = -1;
		for (Node child : node.children) {
			int ch = ht(child);
			if (ch > th) {
				th = ch;
			}
		}
		return th + 1;
	}

	public void mirror() {
		mirror(this.root);
	}

	private void mirror(Node node) {

		int left = 0;
		int right = node.children.size() - 1;
		while (left < right) {
			Node ln = node.children.get(left);
			Node rn = node.children.get(right);

			node.children.set(left, rn);
			node.children.set(right, ln);

			left++;
			right--;
		}
		for (Node child : node.children) {
			mirror(child);
		}

	}

	public void preorder() {
		preorder(this.root);
	}

	private void preorder(Node node) {

		System.out.print(node.data + " ");

		for (Node child : node.children) {
			preorder(child);
		}

	}

	public void postorder() {
		postorder(this.root);
	}

	private void postorder(Node node) {

		for (Node child : node.children) {
			postorder(child);
		}
		System.out.print(node.data + " ");

	}

	public void levelorder() {

		LinkedList<Node> queue = new LinkedList();
		queue.addLast(this.root);

		while (!queue.isEmpty()) {
			Node rn = queue.removeFirst();

			System.out.print(rn.data + " ");
			for (Node child : rn.children) {
				queue.addLast(child);
			}
		}
	}

	public void levelorderLW() {

		LinkedList<Node> queue = new LinkedList();
		LinkedList<Node> helper = new LinkedList();
		queue.addLast(this.root);

		while (!queue.isEmpty()) {
			Node rn = queue.removeFirst();

			System.out.print(rn.data + " ");
			for (Node child : rn.children) {
				helper.addLast(child);
			}
			if (queue.isEmpty()) {
				System.out.println();

				queue = helper;
				helper = new LinkedList();
			}
		}
	}

	public class Heapmover {

		int size;
		boolean find;
		int max = Integer.MIN_VALUE;
		int ht;
		Node pred;
		Node succ;
		Node jl;
	}

	public void multisolver(int item) {

		Heapmover mover = new Heapmover();
		multisolver(this.root, item, 0, mover);

		System.out.println("Max : " + mover.max);
		System.out.println("find : " + mover.find);
		System.out.println("size : " + mover.size);
		System.out.println("ht : " + mover.ht);
		System.out.println("Pred :" + (mover.pred != null && mover.find == true ? mover.pred.data : null));
		System.out.println("Succ :" + (mover.succ == null ? null : mover.pred.data));
		System.out.println("jl :" + (mover.jl != null ? null : mover.pred.data));
	}

	private void multisolver(Node node, int item, int count, Heapmover mover) {

		mover.size++;

		if (node.data > mover.max) {
			mover.max = node.data;
		}
		if (mover.find == true && mover.succ == null) {
			mover.succ.data = node.data;
		}

		if (node.data == item) {
			mover.find = true;
		}
		if (mover.find == false) {
			mover.pred.data = node.data;
		}
		if (count > mover.ht) {
			mover.ht = count;
		}
		if (node.data > item) {
			if (node.data < mover.jl.data) {
				mover.jl.data = node.data;
			}
		}
		for (Node child : node.children) {
			multisolver(child, item, count + 1, mover);
		}
	}

}
