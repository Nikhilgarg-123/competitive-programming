package atcoder_abc060;

import java.util.*;

public class Problem3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int t = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int i = 0;
		int ans = 0;
		int j = 1;
		int temp = 0;
		while (j < n) {
			temp = arr[i] + t;
			if (arr[j] > temp) {
				j++;
				i++;
				ans += t;
			} else {
				ans += arr[j] - arr[i];
				i++;
				j++;
			}
		}
		System.out.println(ans + t);

	}

}
