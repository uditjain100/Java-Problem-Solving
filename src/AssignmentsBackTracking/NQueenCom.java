package AssignmentsBackTracking;

public class NQueenCom {

	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void PQueencom(boolean[] boxes, int tq, int qref, String ans, int lastiused) {
		if (tq == qref) {
			count++;
			System.out.println(count + "." + ans);
			return;
		}
		for (int i = lastiused + 1; i < boxes.length; i++) {
			boxes[i] = true;
			PQueencom(boxes, tq, qref + 1, ans + "q" + qref + "b" + i + " ", i);
			boxes[i] = false;
		}

	}

}
