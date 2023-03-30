package Recursion;

public class binary_search_using_recursion {

	public static int binary_search(int arr[], int start, int end, int element) {
		int mid = (start + end) / 2;
		if (arr[mid] == element) {
			return mid;
		} else {

			if (arr[mid] < element) {
				return binary_search(arr, mid + 1, end, element);
			} else if (arr[mid] > element) {
				return binary_search(arr, start, mid, element);
			} else {
				return -1;
			}

		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 10, 20 };
		System.out.println(binary_search(arr, 0, arr.length, 20));

	}

}
