package Lecture12;

public class QuickSort {

	public static void main(String[] args) {
	
		int[] ans = { 40, 10, 50, 30, 20 };
		quicksort(ans, 0, 4);
		for(int i = 0 ; i < ans.length ; i++) {
				System.out.print(ans[i] + " ");
			}
	}

	public static void quicksort(int[] arr, int lo, int hi) {
		int left = lo;
		int right = hi;
		int mid = (lo + hi) / 2;
		int pivot = arr[mid];
		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}
			
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;

				left++;
				right--;
			}
			
			quicksort(arr, lo, right);
			quicksort(arr, left, hi);
		}
		
	}

}
