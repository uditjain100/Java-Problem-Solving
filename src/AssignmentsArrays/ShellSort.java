package AssignmentsArrays;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 5, 4, 3, 2, 1, 0 };
		ss(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void ss(int[] arr) {

		int gap = arr.length / 2;
		int i = 0;
		int j = 0;
		int k = 0;
		while (gap != 0) {
			i = 0;
			j = i + gap;
			while (j != arr.length) {
				if (arr[i] <= arr[j]) {

				} else {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					if (i - gap >= 0) {
						k = i - gap;
						if (arr[i] >= arr[k]) {

						} else {
							int temp2 = arr[i];
							arr[i] = arr[k];
							arr[k] = temp2;
						}
					}
				}
			}

			gap /= 2;
		}

	}

}
