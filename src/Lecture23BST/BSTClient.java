package Lecture23BST;

public class BSTClient {

	public static void main(String[] args) {
		
		int[] in = {5 ,10 ,15 ,20 ,25 ,30 ,35} ;
		BST b = new BST(in) ;
		b.display();
		
		System.out.println(b.size());
		
		System.out.println(b.max());
		
		b.inorder();
		System.out.println();
		b.printdec();
		System.out.println();
		b.PrintInRange(20,60) ;
		
		b.add(24) ;
		System.out.println();
		b.display();
	}

}
