package practice;

public class Binary_Search {

	public static int binsea(int[] arr, int data, int n) {
		int left = 0;
		int right = n - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (data == arr[mid]) {
				return mid;
			} else if (data < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}
		return -1;
	}

}
