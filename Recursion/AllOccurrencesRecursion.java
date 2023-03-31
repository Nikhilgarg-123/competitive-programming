package Recursion;

public class AllOccurrencesRecursion {

	public static void all_occurrence(int arr[], int start, int key) {
		if (start == arr.length) {
			return;
		}
		if (arr[start] == key) {
			System.out.println(start);
		}
		all_occurrence(arr, start + 1, key);
	}

	public static int store_occu(int arr[],int start,int key,int [] ans, int j) {
		
		if(start==arr.length) {
			return j;
		}
		if(arr[start]==key) {
			ans[j]=start;
			return store_occu(arr, start+1, key, ans, j+1);
		}
		return store_occu(arr, start+1, key, ans, j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 7, 3, 7, 7, 7 };
//		all_occurrence(arr, 0, 7);
		int ans[] = new int[10];
		store_occu(arr, 0, 7, ans, 0);
		for(int i:ans) {
			System.out.println(i);
		}

	}

}
