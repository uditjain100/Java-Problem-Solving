package Lecture9;

public class EndIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 20, 30, 20, 60 };

		System.out.println(findendindex(arr, 0, 20));

	}

	public static int findendindex(int[] arr, int vidx, int item) {
		if (vidx == arr.length) {
			return -1;
		}

		int recans = findendindex(arr, vidx + 1, item);
		if (item == arr[vidx] && recans == -1) {
			return vidx;
		}
		return recans;

	}

}
