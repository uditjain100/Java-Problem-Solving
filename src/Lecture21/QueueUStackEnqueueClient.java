package Lecture21;

public class QueueUStackEnqueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		QueueUStackEnqueue q = new QueueUStackEnqueue();

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);

		q.display();
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

		q.display();
	}

}
