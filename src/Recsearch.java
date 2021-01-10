
public class Recsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 2, 1, 2, 2, 4, 2, 5, 2 };
		allin(arr, 0, 2);
	}

	public static void allin(int[] arr, int idx, int temp) {

		if (arr.length == 0) {
			return;
		}

		if (idx == arr.length) {
			return;
		}

		if (temp == arr[idx]) {
			System.out.println(idx);
			allin(arr, idx + 1, temp);
		} else {
			allin(arr, idx + 1, temp);
		}
	}

}
