package Lecture21;

public class QueueULinkedListClient {

	public static void main(String[] args) throws Exception {
		
		QueueULinkedList q = new QueueULinkedList();

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);

		q.display();
		System.out.println(q.getfront());

		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

		q.display();

	}

}
