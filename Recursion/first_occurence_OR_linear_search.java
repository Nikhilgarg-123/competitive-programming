package Recursion;

public class first_occurence_OR_linear_search {

	
	
	// method 1
	public static int linear_search(int arr[], int s, int size, int find) {
		if (s == size) {
			return -1;
		}
		if (arr[s] == find) {
			return s;
		}
		return linear_search(arr, s + 1, size, find);
	}

	// method 2
	public static int linear_search_2(int[] arr, int start, int size, int key) {
		if (size == 0) {
			return -1;
		}
		if (arr[start] == key) {
			return 0;
		}
		int i = linear_search_2(arr, start + 1, size - 1, key);
		if (i == -1) {
			return -1;
		}
		return i + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 7, 9, 10, 11 };
		int a = linear_search(arr, 0, arr.length, 3);
		System.out.println(a);
		System.out.println(linear_search_2(arr, 0, arr.length, 6));

	}

}
