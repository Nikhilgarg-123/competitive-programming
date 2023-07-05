package atcoder_abc047;

import java.util.*;

public class problem2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int xs = 0;
		int ys = 0;
		int ye = scn.nextInt();
		int xe = scn.nextInt();
		int test_cases = scn.nextInt();
		while (test_cases-- > 0) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			int x = scn.nextInt();

			if (x == 1) {
				ys = a;
			}
			if (x == 2) {
				ye = a;
			}
			if (x == 3) {
				xs = b;
			}
			if (x == 4) {
				xe = b;
			}

		}

		int area = (ye - ys) * (xe - xs);
		if (area < 0) {
			area = 0;
		}
		System.out.println(area);

	}

}
