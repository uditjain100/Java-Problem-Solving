package UditJain;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int age = scn.nextInt();
		if (age <= 11) {
			System.out.println("Child");
		} else if (age >= 12 && age <= 18) {
			System.out.println("Teenager");
		} else if (age >= 19 && age <= 60) {
			System.out.println("Adult");
		} else {
			System.out.println("Old");
		}
	}

}
