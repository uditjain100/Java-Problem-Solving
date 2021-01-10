package AssignmentsDataStructures;

public class QueueRClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		QueueR queue = new QueueR(5);
		QueueR helper = new QueueR(5);

		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i * 10);
			queue.display();
		}
		System.out.println();
		reversedisplay(queue, 0);
		System.out.println();
		ActualDisplay(queue, helper);
		queue.display();
		for (int i = 1; i <= 5; i++) {
			queue.display();
			queue.dequeue();
		}

	}

	public static void reversedisplay(QueueR queue, int count) throws Exception {

		if (queue.size == count) {
			return;
		}
		int temp = queue.dequeue();
		queue.enqueue(temp);
		reversedisplay(queue, count + 1);
		System.out.println(temp);

	}

	public static void actualreverse(QueueR queue, int count) throws Exception {

		if (queue.size == count) {
			return;
		}
		int temp = queue.dequeue();
		actualreverse(queue, count + 1);
		queue.enqueue(temp);

	}

	public static void ActualDisplay(QueueR queue, QueueR helper) throws Exception {

		if (queue.isEmpty()) {
			ActualDisplayHelper(queue, helper);
			return;
		}

		int item = queue.dequeue();
		helper.enqueue(item);
		ActualDisplay(queue, helper);
	}

	private static void ActualDisplayHelper(QueueR queue, QueueR helper) throws Exception {

		if (queue.isEmpty()) {
			return;
		}

		int temp = helper.dequeue();
		ActualDisplayHelper(queue, helper);
		queue.enqueue(temp);
	}

}
