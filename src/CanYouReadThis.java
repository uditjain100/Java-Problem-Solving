import java.util.Scanner;

public class CanYouReadThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = "SurajIsCompetetiveProgrammer";
		canread(str);
	}

	private static void canread(String str) {
		// TODO Auto-generated method stub

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				if (i != 0) {
					System.out.println();
				}
				System.out.print(ch);
			}
			if (ch >= 'a' && ch <= 'z') {
				System.out.print(ch);
			}
		}
	}

}
