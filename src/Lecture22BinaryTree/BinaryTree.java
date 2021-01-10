package Lecture22BinaryTree;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {

	Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BinaryTree() {
		this.root = takeInput(null, false);
	}

	private Node takeInput(Node parent, boolean ilc) {

		if (parent == null) {
			System.out.println("Enter the data for root node");
		} else {
			if (ilc) {
				System.out.println("Enter the data for left child of " + parent.data);
			} else {
				System.out.println("Enter the data for right child of " + parent.data);
			}
		}
		int temp = scn.nextInt();
		Node nn = new Node();
		nn.data = temp;

		System.out.println("is their any left child for " + nn.data);
		boolean l = scn.nextBoolean();
		if (l)
			nn.left = takeInput(nn, true); 

		System.out.println("is their any right child for " + nn.data);
		boolean r = scn.nextBoolean();
		if (r)
			nn.right = takeInput(nn, false);

		return nn;
	}

	public BinaryTree(int[] pre, int[] in) {
		this.root = construct(pre, 0, pre.length - 1, in, 0, in.length - 10);
	}

	private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {

		if (plo > phi || ilo > ihi) {
			return null;
		}
		Node nn = new Node();
		nn.data = pre[plo];

		int si = -1;
		for (int i = ilo; i <= ihi; i++) {
			if (pre[plo] == in[i]) {
				si = i;
				break;
			}
		}

		int nel = si - ilo;

		nn.left = construct(pre, plo + 1, plo + nel, in, ilo, si - 1);
		nn.right = construct(pre, plo + nel + 1, phi, in, si + 1, ihi);
		return nn;
	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {

		if (node == null) {
			return;
		}
		String str = "  ";
		if (node.left == null) {
			str += " . " + " -> ";
		} else {
			str += node.left.data + " -> ";
		}

		str += node.data;

		if (node.right == null) {
			str += " <- " + " . ";
		} else {
			str += " <- " + node.right.data;
		}

		System.out.println(str);
		display(node.left);
		display(node.right);

	}

	public int size() {
		return size(this.root);
	}

	private int size(Node node) {

		if (node == null) {
			return 0;
		}
		int ls = size(node.left);
		int rs = size(node.right);

		return ls + rs + 1;
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {

		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int a = node.data;
		int l = max(node.left);
		if (a > l) {
			l = a;
		}
		int r = max(node.right);
		if (l > r) {
			r = l;
		}
		return r;

	}

	public boolean find(int item) {
		return find(this.root, 0);
	}

	private boolean find(Node node, int item) {

		if (node == null) {
			return false;
		}
		boolean l = find(node.left, item);
		boolean r = find(node.right, item);

		return l || r;
	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {

		if (node == null) {
			return -1;
		}
		int hl = ht(node.left);
		int hr = ht(node.right);

		int a = Math.max(hl, hr);
		return a + 1;
	}

	public int Dia() {
		return Dia(this.root);
	}

	private int Dia(Node node) {

		if (node == null) {
			return 0;
		}
		int ld = Dia(node.left);
		int rd = Dia(node.right);
		int sw = ht(node.left) + ht(node.right) + 2;

		return Math.max(sw, Math.max(ld, rd));
	}

	public class Diapair {
		int dia = 0;
		int ht = -1;

	}

	public int Dia2() {
		return Dia2(root).dia;
	}

	private Diapair Dia2(Node node) {

		if (node == null) {
			Diapair dp = new Diapair();
			return dp;
		}
		Diapair np = new Diapair();

		Diapair ldp = Dia2(node.left);
		Diapair rdp = Dia2(node.right);

		int height = Math.max(ldp.ht, rdp.ht) + 1;

		int ld = ldp.dia;
		int rd = rdp.dia;
		int sw = ldp.ht + rdp.ht + 2;

		np.ht = height;
		np.dia = Math.max(sw, Math.max(ld, rd));
		return np;

	}

	public class BalPair {
		boolean isBal = true;
		int ht = -1;

	}

	public boolean isBalanced() {
		return isBalanced(root).isBal;
	}

	private BalPair isBalanced(Node node) {

		if (node == null) {
			BalPair dp = new BalPair();
			return dp;
		}
		BalPair np = new BalPair();

		BalPair ldp = isBalanced(node.left);
		BalPair rdp = isBalanced(node.right);

		int height = Math.max(ldp.ht, rdp.ht) + 1;

		np.ht = height;
		boolean ld = ldp.isBal;
		boolean rd = rdp.isBal;
		int sw = Math.abs(ldp.ht - rdp.ht);

		np.isBal = ld && rd && sw <= 1;
		return np;
	}

	public void preorder() {
		preorder(root);
	}

	private void preorder(Node node) {
		if (node == null) {
			return;
		}

		System.out.print(node.data + " ");
		preorder(node.left);
		preorder(node.right);

	}

	public void postorder() {
		postorder(root);
	}

	private void postorder(Node node) {
		if (node == null) {
			return;
		}

		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data + " ");
	}

	public void inorder() {
		inorder(root);
	}

	private void inorder(Node node) {
		if (node == null) {
			return;
		}

		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);

	}

	public class Pair {
		Node node;
		boolean selfdone;
		boolean leftdone;
		boolean rightdone;
	}

	public void preorderI() {

		LinkedList<Pair> stack = new LinkedList<>();

		Pair sp = new Pair();
		sp.node = this.root;

		stack.addFirst(sp);

		while (!stack.isEmpty()) {

			Pair tp = stack.getFirst();

			if (tp.node == null) {
				stack.removeFirst();
				continue;
			}
			if (tp.selfdone == false) {
				System.out.println(tp.node.data + " ");
				tp.selfdone = true;

			} else if (tp.leftdone == false) {
				Pair np = new Pair();
				np.node = tp.node.left;
				stack.addFirst(np);
				tp.leftdone = true;

			} else if (tp.rightdone == false) {
				Pair np = new Pair();
				np.node = tp.node.right;
				stack.addFirst(np);
				tp.rightdone = true;

			} else {
				stack.removeFirst();
			}
		}
		System.out.println();
	}
}
