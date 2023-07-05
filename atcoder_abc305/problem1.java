package atcoder_abc305;

import java.util.*;

public class problem1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int rem = n % 5;
		if (rem == 0) {
			System.out.println(n);
		} else if (rem == 1) {
			System.out.println(n - 1);

		} else if (rem == 2) {
			System.out.println(n - 2);

		} else if (rem == 3) {
			System.out.println(n + 2);

		} else if (rem == 4) {
			System.out.println(n + 1);

		}

	}

}
