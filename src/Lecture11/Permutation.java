package Lecture11;

public class Permutation {

	public static void main(String[] args) {

		Permutation("abc", " ");
	}

	public static void Permutation(String que, String ans) {
		if (que.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0 ; i < que.length() ; i++) {
			char ch = que.charAt(0);
			String ros = que.substring(0,i) + que.substring(i+1);
			Permutation(ros , ans + que.charAt(i) );
			
		}
		
	}
}