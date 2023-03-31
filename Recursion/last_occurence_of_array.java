package Recursion;

public class last_occurence_of_array {

	public static int last_occ(int[] arr, int start, int size, int key) {
		if (size == 0) {
			return -1;
		}

		int i = last_occ(arr, start + 1, size - 1, key);

		if (i == -1) {
			if (arr[start] == key) {
				return 0;
			} else {
				return -1;
			}
		}
		return i + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 7, 9, 9, 7, 10, 11 };

		System.out.println(last_occ(arr, 0, arr.length, 7));

	}

}
