package atcoder_abc052;

import java.util.*;

public class problem2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String str = scn.next();

		int x = 0;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == 'I') {
				x++;
			} else {
				x--;
			}
			ans = Math.max(ans, x);
		}
		System.out.println(ans);
	}

}
