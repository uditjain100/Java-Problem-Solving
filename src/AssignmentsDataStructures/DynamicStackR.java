package AssignmentsDataStructures;

public class DynamicStackR extends StackR {

	public DynamicStackR(int cap) throws Exception {
		super(cap);
	}

	@Override
	public void push(int item) throws Exception {

		if (isFull()) {
			int[] na = new int[2 * this.data.length];
			for (int i = 0; i < this.data.length; i++) {
				na[i] = this.data[i];
			}
			this.data = na;
		}
		super.push(item);

	}

}
