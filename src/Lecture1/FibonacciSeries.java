package UditJain;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		int sum = 0;
		int var = 1;
		while (var < n - 1) {
			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;
			var++;
		}
		
	}

}
