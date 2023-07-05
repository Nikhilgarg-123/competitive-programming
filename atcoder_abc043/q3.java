package atcoder_abc043;

import java.util.*;

public class q3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int count = Integer.MAX_VALUE;
		Arrays.sort(arr);
		for (int i = arr[0]; i <= arr[n - 1]; i++) {
			int temp = 0;
			for (int j = 0; j < n; j++) {
				temp = temp + ((arr[j] - i) * (arr[j] - i));
			}
			count = Math.min(temp, count);

		}
		System.out.println(count);

	}

}
