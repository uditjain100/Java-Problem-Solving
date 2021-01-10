/*
 *
 *  Author : Udit Jain
	College : Maharaja Agrasen Institute Of Technology Rohini
	Year/Department : 2nd year - Computer Science And Engineering
	E-Mail Id : jain30udit@gmail.com

*/

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(now("My Name is Udit/nJain/t"));

	}

	public static int now(String str) {

		int word = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			String cc = str.substring(i, i + 1);
			if (cc.equals(" ") || cc.equals("/n") || cc.equals("/t")) {
				word++;
			}
		}
		return word + 1;
	}

}
