package Lecture16;

public class LLClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.addLast(60);

		/*ll.display();
		System.out.println();
		System.out.println(ll.getfirst());

		System.out.println(ll.getlast());

		System.out.println(ll.getAt(2));

		System.out.println(ll.getAt(1));
*/
		// ll.addAt(60, 1);
		//ll.addAt(50, ll.size());

		// ll.display();
		// ll.removeAt(1) ;
		ll.display();
		ll.reverseDI();
		ll.display();
//		// ll.reversePI() ;
//		// ll.display() ;
//		// ll.reverseDR() ;
//		// ll.display();
//		ll.reverseDRHeap1();
//		ll.display();
//		ll.fold();
//		ll.display();
	}

}
