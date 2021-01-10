package Lecture21;

public class StackULinkedListClient {

	public static void main(String[] args) throws Exception {

		StackULinkedList q = new StackULinkedList();

		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		q.push(50);

		q.display();

		System.out.println(q.top());

		q.display();
		
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());

		q.display();
	}

}
