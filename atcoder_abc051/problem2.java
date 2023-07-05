package atcoder_abc051;

import java.util.*;

public class problem2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int k = scn.nextInt();
		int s = scn.nextInt();
		if (s == 0) {
			System.out.println(1);
			System.exit(0);
		}
		if (s < k) {
			k = s;
		}
		int steps = 0;
		int a = k + 1;

		while (a-- > 0) {
			int sumleft = s - a;
			if (sumleft <= k && sumleft >= 0) {
				steps += (sumleft + 1);
			} else {
				int ll = sumleft - k;
				if (ll <= k) {
					int sumtemp = k - ll + 1;
					steps += sumtemp;
				}
			}

		}
		System.out.println(steps);
	}

}
