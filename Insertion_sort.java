package sorting_techniques;

import java.util.Arrays;

public class Insertion_sort {

	// insertion sort is about swapping the values multiple times by comparing with
	// nearest values
	public static void main(String[] args) {
		int[] arr = { 90, 3, 5, 6, 67 };
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else {
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
