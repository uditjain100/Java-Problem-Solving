import java.util.*;

    class Stack {

	protected int[] data;
	protected int tos;

	public Stack() {
		this.data = new int[5];
		this.tos = -1;
	}

	public Stack(int cap) {
		this.data = new int[cap];
		this.tos = -1;
	}

	public void push(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Stack is full");
		}
		this.tos++;
		this.data[this.tos] = item;

	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int rv = this.data[this.tos];
		this.data[this.tos] = 0;
		this.tos--;
		return rv;
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}

		int rv = this.data[this.tos];
		return rv;
	}

	public int size() {
		return this.tos + 1;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public boolean isFull() {
		return this.size() == this.data.length;
	}

	public void display() {
		System.out.println("-----------------");
		for (int i = this.tos; i >= 0; i--) {
			System.out.print(this.data[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------");
	}
}

     class DynamicStack extends Stack {

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

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {
			int n1 = scn.nextInt();
			int[] prices = new int[n1];
			for (int j = 0; j < n1; j++) {
				int n2 = scn.nextInt();
				prices[j] = n2;
			}
			int[] span = stockspan(prices);
			for (int val : span) {
				System.out.println(val + " ");
			}
			System.out.println();
		}

	}

	public static int[] stockspan(int[] prices) throws Exception {

		int[] span = new int[prices.length];
		Stack s = new DynamicStack();

		for (int i = 0; i < prices.length; i++) {
			while (!s.isEmpty() && prices[s.peek()] < prices[i]) {
				s.pop();
			}
			if (s.isEmpty()) {
				span[i] = i + 1;
			} else {
				span[i] = i - s.peek();
			}
			s.push(i);
		}
		return span;
	}
}
