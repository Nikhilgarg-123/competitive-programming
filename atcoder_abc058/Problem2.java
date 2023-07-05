package atcoder_abc058;

import java.util.*;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String temp1 = scn.next();
		String temp2 = scn.next();
		String ans = "";

		for (int i = 0; i < temp1.length(); i++) {
			ans += temp1.charAt(i);
			if (i < temp2.length()) {

				ans += temp2.charAt(i);
			}

		}

		System.out.println(ans);

	}

}
