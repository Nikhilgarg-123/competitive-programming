package Recursion;

public class Bubble_Sort_Code {

	public static void bubble_sort(int arr[], int n) {

		if (n == 1) {
			return;
		}

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		bubble_sort(arr, n - 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 9, 8, 7, 6, 5, 4, 32, 1 };
		bubble_sort(arr, arr.length);
		for (int I : arr) {
			System.out.println(I);
		}

	}

}
