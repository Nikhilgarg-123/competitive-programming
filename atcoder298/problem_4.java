package atcoder298;

import java.util.*;

public class problem_4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int q = scn.nextInt();
		String str = "1";
		while (q-- > 0) {
			int n = scn.nextInt();
			if (n == 1) {
				int temp = scn.nextInt();
				String tem = String.valueOf(temp);
				str += tem;
			} else if (n == 2) {
				str = str.substring(1);
			}

			else {
				System.out.println(Long.valueOf(str) % 998244353);
			}
		}

	}

}
