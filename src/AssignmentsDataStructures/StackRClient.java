package AssignmentsDataStructures;

public class StackRClient {

	public static void main(String[] args) throws Exception {

		StackR stack = new StackR();
		StackR helper = new StackR();

		for (int i = 1; i <= 5; i++) {
			stack.push(10 * i);
			stack.display();
			System.out.println();
		}
		System.out.println();
		reversedisplay(stack);
		System.out.println();
		System.out.println();
		stack.display();
		System.out.println();
		System.out.println();
		Actualdisplay(stack, helper);
		stack.display();
		System.out.println();
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			stack.display();
			System.out.println();
			stack.pop();
		}
	}

	public static void reversedisplay(StackR stack) throws Exception {

		if (stack.isEmpty()) {
			return;
		}
		int temp = stack.pop();
		reversedisplay(stack);
		System.out.print(temp + "\t");
		stack.push(temp);
	}

	public static void Actualdisplay(StackR stack, StackR helper) throws Exception {
		if (stack.isEmpty()) {
			ActualdisplayHelper(stack, helper);
			return;
		}
		int temp = stack.pop();
		helper.push(temp);
		Actualdisplay(stack, helper);
	}

	public static void ActualdisplayHelper(StackR stack, StackR helper) throws Exception {
		if (helper.isEmpty()) {
			return;
		}
		int temp = helper.pop();
		ActualdisplayHelper(stack, helper);
		stack.push(temp);
	}

}
