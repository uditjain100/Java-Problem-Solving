package Lecture15;

import Lecture14.Stack;

public class DynamicStack extends Stack {

	@Override
	public void push(int item) throws Exception {
		if (isFull()) {
			int[] oa = this.data;
			int[] na = new int[2 * this.data.length];
			for (int i = 0; i < this.size(); i++) {
				na[i] = oa[i];
			}
			this.data = na;
		}
		super.push(item);
	}

}
