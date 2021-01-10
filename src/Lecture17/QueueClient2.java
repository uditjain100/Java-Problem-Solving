package Lecture17;

import Lecture15.DynamicQueue;
import Lecture15.Queue;

public class QueueClient2 {

	public static void main(String[] args) throws Exception {

		Queue a = new DynamicQueue();

		a.enqueue(10);
		a.enqueue(20);
		a.enqueue(30);
		a.enqueue(40);
		a.enqueue(50);
		a.display();
		reversedisplay(a, 0);
		a.display();
		actualreverse(a);
		a.display();
		
	}

	public static void reversedisplay(Queue q, int count) throws Exception {

		if (count == q.size()) {
			return;
		}
		int temp = q.dequeue();
		q.enqueue(temp);
		reversedisplay(q, count + 1);
		System.out.println(temp + " ");
		
	}

	public static void actualreverse(Queue q) throws Exception {
		if (q.isEmpty()) {
			return;
		}
		int temp = q.dequeue();
		actualreverse(q);
		q.enqueue(temp);

	}

}
