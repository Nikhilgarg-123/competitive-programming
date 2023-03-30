package Recursion;

public class check_array_sorted {
	public static boolean issorted(int arr[] , int start, int size) {
		if(size==0 || size==1) {
			return true;
		}
		
		if(arr[start]<=arr[start+1] && issorted(arr, start+1, size-1)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
//		int arr[]= {23,789,456,4,1,48,49,4,89,49,49,4};
		int arr[]= {1,2,3,4,5,6};
		System.out.println(issorted(arr, 0, arr.length));
	}
}
