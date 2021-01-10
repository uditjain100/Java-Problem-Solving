package Lecture24GenericFxn;

import java.util.Comparator;

public class GenericFxn {

	public static void main(String[] args) {

		Car[] carr = new Car[5];
		//display(carr);

		carr[0] = new Car(100, 10, "Black");
		carr[1] = new Car(400, 20, "Red");
		carr[2] = new Car(80, 60, "White");
		carr[3] = new Car(780, 5, "Brown");
		carr[4] = new Car(34, 100, "Grey");

		display(carr);
		
		bubblesort(carr) ;
		display(carr) ;
		
//		bubblesort1(carr ,new CarSpeedComparator()) ;
//		display(carr) ;
//		bubblesort1(carr ,new CarPriceComparator()) ;
//		display(carr) ;
//		bubblesort1(carr ,new CarColourComparator()) ;
//		display(carr) ;
	}

	private static <T> void display(T[] arr) {

		for (T val : arr) {
			System.out.println(val);
		}
		System.out.println();

	}

	public static <T extends Comparable<T>> void bubblesort(T[] arr) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			for (int j = 0; j < arr.length - counter - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {

					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}

	}
	public static <T> void bubblesort1(T[] arr ,Comparator<T> comparator) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			for (int j = 0; j < arr.length - counter - 1; j++) {
				if (comparator.compare(arr[j],arr[j + 1]) > 0) {

					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}

	}

}
