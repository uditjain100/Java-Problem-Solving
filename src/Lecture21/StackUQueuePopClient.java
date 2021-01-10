package Lecture21;

public class StackUQueuePopClient {

	public static void main(String[] args) throws Exception {

		StackUQueuePop p = new StackUQueuePop();

		p.push(10);
		p.push(20);
		p.push(30);
		p.push(40);
		p.push(50);

		p.display();
		System.out.println(p.pop());
		System.out.println(p.pop());
		System.out.println(p.pop());
		System.out.println(p.pop());
		System.out.println(p.pop());

		p.display();
	}

}
