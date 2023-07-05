package atcoder_abc299;

import java.util.*;

public class q2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int t = scn.nextInt();

		int[] c = new int[n];
		int[] r = new int[n];

		for (int i = 0; i < n; i++) {
			c[i] = scn.nextInt();
		}
		for (int i = 0; i < n; i++) {
			r[i] = scn.nextInt();
		}

		boolean check = false;
		int temp = 0;
		int ans = 0;
		int temp1 = 0;
		int ans1 = 0;
		int t1 = c[0];

		for (int i = 0; i < n; i++) {
			if (c[i] == t) {
				if (r[i] > temp) {
					ans = i+1;
					check = true;
				}
				temp = Math.max(temp, r[i]);

			}

			if (c[i] == t1) {
				if (r[i] > temp1) {
					ans1 = i+1;
				}
				temp1 = Math.max(temp, r[i]);

			}

		}

		if (check) {
			System.out.println(ans);

		} else {
			System.out.println(ans1);
		}

	}

}
