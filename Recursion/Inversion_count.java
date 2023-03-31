package Recursion;

public class Inversion_count {
	public static int merge(int arr[], int s, int e) {

		int mid = (s + e) / 2;
		int i = s;
		int j = mid + 1;
		int k = s;

		int temp[] = new int[100];
		int cnt = 0;
		while (i <= mid && j <= e) {
			if (arr[i] <= arr[j]) {
				temp[k] = arr[i];
				i++;
				k++;
			} else {
				temp[k] = arr[j];
				j++;
				k++;
				cnt += mid - i + 1;
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
		return cnt;
	}

	public static int inv_count(int arr[], int s, int e) {
		if (s >= e) {
			return 0;
		}
		int mid = (s + e) / 2;
		int x = inv_count(arr, s, mid);
		int y = inv_count(arr, mid + 1, e);

		int z = merge(arr, s, e);
		return x + y + z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 5, 2, 6, 3, 0 };
		System.out.println(inv_count(arr, 0, arr.length - 1));

	}

}
