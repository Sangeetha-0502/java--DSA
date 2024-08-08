package practice;

public class Binary_Driver {
	public static void main(String[] args) {
		Binary_Search bin = new Binary_Search();
		int[] arr = { 2, 6, 9, 15, 19, 25, 30, 35 };
		int data = 6;
		int n = arr.length;
		int result = Binary_Search.binsea(arr, data, n);
		System.out.println("The data present in the index; " + result);
	}

}
