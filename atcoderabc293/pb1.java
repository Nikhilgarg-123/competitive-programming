package atcoderabc293;

//   https://atcoder.jp/contests/abc293/tasks/abc293_a

import java.util.*;

public class pb1 {
	public static String swap(String str, int i, int j, String ans) {
		char temp1 = str.charAt(i);
		char temp2 = str.charAt(j);
		ans += temp2;
		ans += temp1;

		return ans;

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String ans = "";
		for (int i = 0; i < str.length(); i = i + 2) {
			ans = swap(str, i, i + 1, ans);
		}
		System.out.println(ans);
	}
}
