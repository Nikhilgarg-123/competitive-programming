package atcoder_abc043;

import java.util.*;

public class q2 {

	public static void main(String[] args) {
		String ans = "";
		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				ans += '1';
			} else if (str.charAt(i) == '0') {
				ans += '0';
			} else if (str.charAt(i) == 'B') {
				if (ans.length() > 0) {
					ans = ans.substring(0, ans.length() - 1);
				}
			}

		}

		System.out.println(ans);

	}

}
