package AssignmentsDataStructures;

import java.util.Scanner;

public class ImporOfTime {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		QueueR queue = new QueueR();
		int[] arr = { 5, 4, 2, 3, 1 };
		int[] arr2 = { 5, 2, 1, 4, 3 };
		ImpOfTime(queue, arr, arr2);
	}

	public static void ImpOfTime(QueueR queue, int[] arr, int[] arr2) throws Exception {

		for (int i = 0; i < arr.length; i++) {
			queue.enqueue(arr[i]);
		}
		int tc = 0;
		for (int i = 0; i < arr2.length; i++) {

			if (arr2[i] == queue.getFront()) {
				queue.dequeue();
				tc++;
			} else {
				while (arr2[i] != queue.getFront()) {
					int a = queue.dequeue();
					queue.enqueue(a);
				}
				tc++;
				queue.dequeue();
				tc++;
			}
		}
		System.out.println(tc);
	}
}
