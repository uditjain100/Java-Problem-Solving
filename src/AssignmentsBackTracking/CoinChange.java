package AssignmentsBackTracking;

public class CoinChange {

	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] boxes = { 2, 3, 5, 6 };
		//PQueenCom(boxes, 10, "", 0);
		// System.out.println();
		// PQueenPer(boxes, 10, "");
		System.out.println(PQueenPer_count(boxes, 10));
	}

	public static void PQueenCom(int[] denom, int amount, String ans, int nu) {

		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = nu; i < denom.length; i++) {
			if (amount >= denom[i]) {
				PQueenCom(denom, amount - denom[i], ans + denom[i], i);
			}
		}

	}

	public static void PQueenPer(int[] denom, int amount, String ans) {

		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < denom.length; i++) {
			if (amount >= denom[i]) {
				PQueenPer(denom, amount - denom[i], ans + denom[i]);
			}
		}

	}

	public static int PQueenPer_count(int[] denom, int amount) {

		if (amount == 0) {
			return 1;
		}
		
		int count = 0;
		for (int i = 0; i < denom.length; i++) {
			if (amount >= denom[i]) {
				count += PQueenPer_count(denom, amount - denom[i]);
			}
		}

		return count;
	}
}
