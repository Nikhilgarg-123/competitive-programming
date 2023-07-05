package atcoder_abc048;

import java.util.*;

public class problem3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int x = scn.nextInt();
		int arr[] = new int[n];
		int arr1[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr1[i] = arr[i];
		}
		int count1 = 0;
		for (int i = 0; i < n - 1; i++) {
			int sum = arr[i] + arr[i + 1];
//			while (sum > x) {
//				sum--;
//				count1++;
//				arr[i]--;
//				sum = arr[i] + arr[i + 1];
//
//			}
			if (sum > x) {
				int aaa = sum - x;
				count1 += aaa;
				arr[i] -= aaa;
				

			}
		}

		int count2 = 0;
		for (int i = 1; i < n; i++) {
			int sum = arr1[i - 1] + arr1[i];
//			while (sum > x) {
//				sum--;
//				count2++;
//				arr1[i]--;
//				sum = arr1[i - 1] + arr1[i];
//
//			}
			if (sum > x) {
				int aaa = sum - x;
				count2 += aaa;
				arr1[i] = arr1[i] - aaa;

			}

		}
//		System.out.println(count1);
//		System.out.println(count2);

		System.out.println(Math.min(count1, count2));

	}

}
