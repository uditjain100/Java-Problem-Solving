package AssignmentsBasics;

import java.util.Scanner;

public class FAHRENHEIT_TO_CELSIUS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int ll = scn.nextInt();
		int ul = scn.nextInt();
		int div = scn.nextInt();
		
		while(ll <= ul) {
			float q = (float)5/9 ;
			float f = (q*(ll-32)) ;
			System.out.println(ll + " " + (int)f);
			ll = ll + div ;
		}
	}

}
