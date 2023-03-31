package Recursion;

public class merge_sorting {

	public static void merge(int arr[], int s, int e) {

		int mid = (s + e) / 2;
		int i = s;
		int j = mid + 1;
		int k = s;

		int temp[] = new int[100];

		while (i <= mid && j <= e) {
			if (arr[i] <= arr[j]) {
				temp[k] = arr[i];
				i++;
				k++;
			} else  {
				temp[k] = arr[j];
				j++;
				k++;
			}
		}

		while (i <= mid) {
			temp[k] = arr[i];
			i++;
			k++;
		}
		while (j <= e) {
			temp[k] = arr[j];
			j++;
			k++;
		}

		for (int m = s; m <= e; m++) {
			arr[m] = temp[m];
		}
	}

	public static void merge_sort(int arr[], int s, int e) {
		if (s >= e) {
			return;
		}

		int mid = (s + e) / 2;

		merge_sort(arr, s, mid);
		merge_sort(arr, mid + 1, e);
		
		merge(arr, s, e);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,8,7,50,2,60,9,4,3};
	
		merge_sort(arr, 0, arr.length-1);
		for(int i:arr) {
			System.out.println(i);
		}
	}
}
