package atcoder296;

import java.util.*;

public class pb4 {
	// https://atcoder.jp/contests/abc296/tasks/abc296_d
// abhi shi nahi hai
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		long n = scn.nextLong();
		long x = scn.nextLong();

		long a = x / n;
		if (a * n < x) {
			a++;
		}
		if (a > n) {
			System.out.println(-1);
			System.exit(0);
		} else {
			long b = x / a;
			if (b * a < x) {
				b++;
			}
			if (b > n) {
				System.out.println(-1);
				System.exit(0);
			}
			System.out.println(a * b);
		}
	}
}
