package com.balu.gl.sorting;

public class MergeSortImpl {

	public void merge(int[] array, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		/* Create temporary arrays */
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];

		/* Copy data to temporary arrays */
		for (int i = 0; i < n1; ++i)
			leftArray[i] = array[left + i];
		for (int j = 0; j < n2; ++j)
			rightArray[j] = array[mid + 1 + j];

		/* Merge the temporary arrays */

		// Initial indexes of first and second sub-arrays
		int i = 0, j = 0;

		// Initial index of merged sub-array array
		int k = left;
		while (i < n1 && j < n2) {
			if (leftArray[i] >= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			array[k] = leftArray[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
	}

	public void sort(int[] array, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			sort(array, left, mid);
			sort(array, mid + 1, right);
			merge(array, left, mid, right);
		}
	}

}
