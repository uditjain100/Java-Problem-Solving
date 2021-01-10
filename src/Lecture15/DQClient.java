package Lecture15;

public class DQClient {

	public static void main(String[] args) throws Exception {
		
		Queue a = new DynamicQueue();
		a.enqueue(10);
		a.enqueue(20);
		a.enqueue(30);
		a.enqueue(40);
		a.enqueue(50);
		a.enqueue(60);
		a.enqueue(70);
		a.enqueue(80);
		a.enqueue(90);
		a.display();
	}

}
