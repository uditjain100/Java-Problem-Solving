package Lecture15;

public class DynamicQueue extends Queue {
	@Override
	public void enqueue(int item) throws Exception {
		if (isFull()) {
			int[] oa = this.data;
			int[] na = new int[2 * this.data.length];
			for (int i = 0; i < this.size(); i++) {
				int idx = (this.front + i) % this.data.length;
				na[i] = oa[idx];
			}
			this.data = na;
			this.front = 0;
		}
		super.enqueue(item);
	}
}
