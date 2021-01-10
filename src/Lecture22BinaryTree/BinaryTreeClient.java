package Lecture22BinaryTree;

public class BinaryTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 10 true 20 true 40 false false true 50 false false true 30 false true 60 false false

		BinaryTree bt = new BinaryTree();
		bt.display();
//		System.out.println(bt.max());
//		System.out.println(bt.size());
//		System.out.println(bt.ht());
//		System.out.println(bt.find(500));
//		System.out.println(bt.Dia());
//		System.out.println(bt.Dia2());
//		System.out.println(bt.isBalanced());
		bt.preorder();
		System.out.println();
//		bt.preorderI();
// 		System.out.println();
//		bt.inorder();
//		System.out.println();
		bt.postorder();

	}

}
