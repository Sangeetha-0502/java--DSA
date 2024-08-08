package com.fs.jul22;

import java.util.Arrays;

public class selection_sort {

	public static void main(String[] args) {
		int[] a = { 10, 8, 5, 2, 1 };
		for (int i = 0; i < a.length; i++) {
			int min_index = i;
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[i]) {
					min_index = j;

				}
			}
			int temp = a[i];
			a[i] = a[min_index];
			a[min_index] = temp;
		}
		System.out.println(Arrays.toString(a));

	}

}
