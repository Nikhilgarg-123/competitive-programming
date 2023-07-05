package atcoder_abc046;

import java.util.*;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int m = scn.nextInt();
		long met = 0;

		if (n == 1) {
			System.out.println(m);
		} else if (n == 2) {
			System.out.println(m * (m - 1));
		} else {
			met = m;
			while (n-- > 1) {
				met *= (m - 1);
			}
			System.out.println(met);
		}

	}

}
