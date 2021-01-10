package Lecture15;

import Lecture14.Stack;

public class DSClient {

	public static void main(String[] args) throws Exception {

		Stack a = new DynamicStack();
		a.push(10);
		a.push(20);
		a.push(30);
		a.push(40);
		a.push(50);
		a.push(60);
		a.push(70);
		a.display();

	}

}
