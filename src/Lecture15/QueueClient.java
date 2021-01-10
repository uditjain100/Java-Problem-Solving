package Lecture15;

public class QueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue a = new Queue();
		a.enqueue(10);
		a.enqueue(20);
		a.enqueue(30);
		a.enqueue(40);
		a.enqueue(50);
		a.display();
		System.out.println(a.dequeue());
		System.out.println(a.dequeue());
		a.display();
		a.enqueue(60);
		a.enqueue(70);
		a.display();
	}

}
