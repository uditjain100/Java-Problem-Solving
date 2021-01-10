package AssignmentsBasics;

import java.util.Scanner;

public class LowerCaseUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scn = new Scanner(System.in) ;
		char ch = scn.next().charAt(0) ;
		
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("Upper case");
		}else if(ch >= 'a' && ch <= 'z'){
			System.out.println("Lower case");
		}else {
			System.out.println("Invalid");
		}
		
	}

}
