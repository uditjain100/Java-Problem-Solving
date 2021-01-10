package Lecture8Recursion;

public class Recursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printdecinc(7);

	}

	public static void printdecinc(int n) {
		if (n == 0) {
			return;
		}
		if (n % 2 == 1) {
			System.out.println(n);
		}

		printdecinc(n - 1);

		if (n % 2 == 0) {
			System.out.println(n);
		}   
	}
}
