package Lecture4;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		addition();
		System.out.println("bye");

		additionParams(6, 8);
	}

	public static void additionParams(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	public static void addition() {
		int a = 2;
		int b = 3;
		int sum = a + b;

		subtraction();
		System.out.println(sum);
	}

	public static void subtraction() {
		int a = 8;
		int b = 2;
		int sub = a - b;

		System.out.println(sub);
	}
}
