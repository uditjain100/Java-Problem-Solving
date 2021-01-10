
public class Akhil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun("My is as as as as s idbi jdbqei ajb Nishchay");
	}

	public static void fun(String str) {
		// current word length
		int cwl = 0;
		// smallest word length
		int swl = Integer.MAX_VALUE;
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == ' ') {
				if (swl > cwl) {
					swl = cwl;
					ans = str.substring(i - swl, i);
					cwl = 0;
				} else {
					cwl = 0 ;
				}
			} else {
				cwl++;
			}
		}
		System.out.println(swl);
		System.out.println(ans);
	}
}
