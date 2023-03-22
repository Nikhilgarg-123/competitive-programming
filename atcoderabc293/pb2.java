package atcoderabc293;

import java.util.*;

public class pb2 {
	// https://atcoder.jp/contests/abc293/tasks/abc293_b
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		Scanner scn = new Scanner(System.in);
		int arrsize = scn.nextInt();
		int arr[] = new int[arrsize];
		for (int i = 0; i < arrsize; i++) {
			arr[i] = scn.nextInt();
		}
		int check[] = new int[arrsize];

		for (int i = 0; i < arrsize; i++) {
			if (check[i] == 0) {
				check[arr[i] - 1] = 1;
			}
		}

		for (int i = 0; i < arrsize; i++) {
			if (check[i] == 0) {
				arr1.add(i + 1);
			}
		}

		System.out.println(arr1.size());
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}

}
