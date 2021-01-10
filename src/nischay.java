import java.util.Scanner;

public class nischay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();
		t = t + 1;
		String[] arr = new String[t];

		for (int i = 0; i < t; i++) {
			arr[i] = scn.nextLine();
		}

		for (int i = 1; i < t; i++) {
			String str = arr[i];
			for (int j = 0; j < str.length(); j++) {
				if (j % 2 == 0) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.print(" ");
			for (int j = 0; j < str.length(); j++) {
				if (j % 2 != 0) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
	}

}
