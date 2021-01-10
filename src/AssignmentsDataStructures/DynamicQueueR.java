package AssignmentsDataStructures;

public class DynamicQueueR extends QueueR {

	@Override
	public void enqueue(int item) throws Exception {

		if (isFull()) {

			int[] na = new int[2 * this.data.length];
			for (int i = 0; i < this.data.length; i++) {
				int ai = (this.front + i) % this.data.length;
				na[i] = this.data[ai];
			}
			this.data = na;
			this.front = 0;
		}
		super.enqueue(item);
	}

}
