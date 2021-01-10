package Lecture10;

import java.util.ArrayList;

public class CoinToss {

	public static void main(String[] args) {

		System.out.println(CoinToss(3));

	}

	public static ArrayList<String> CoinToss(int n) {
		if (n == 0) {
			ArrayList<String> xyz = new ArrayList<>();
			xyz.add("");
			return xyz;
		}

		ArrayList<String> recans = CoinToss(n - 1);
		ArrayList<String> myres = new ArrayList<>();

		for (String val : recans) {
			myres.add("H" + val);
			myres.add("T" + val);
		}
		return myres;
	}

}
