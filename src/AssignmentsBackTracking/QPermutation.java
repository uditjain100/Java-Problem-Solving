package AssignmentsBackTracking;

public class QPermutation {
	public static void main(String[] args) {
		boolean[] boxes = new boolean[4];
		QueenPer(boxes, 2, 0, "");

	}

	public static void QueenPer(boolean[] boxes, int tq, int qref, String ans) {
		if (tq == qref) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < boxes.length; i++) {
			if (boxes[i] == false) {
				boxes[i] = true;
				QueenPer(boxes, tq, qref + 1, ans + "q" + qref + "b" + i + " ");
				boxes[i] = false;
			}
		}

	}

	public static void PQueenPer(boolean[] boxes, int tq, int qref, String ans) {
		if (tq == qref) {
			count++;
			System.out.println(count + "." + ans);
			return;
		}
		for (int i = 0; i < boxes.length; i++) {
			if (boxes[i] == false) {
				boxes[i] = true;
				PQueenPer(boxes, tq, qref + 1, ans + "q" + qref + "b" + i + " ");
				boxes[i] = false;
			}
		}

	}
}
