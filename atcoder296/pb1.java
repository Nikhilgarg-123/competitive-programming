package atcoder296;

import java.util.*;
import java.io.*;
// https://atcoder.jp/contests/abc296/tasks/abc296_a
public class pb1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		boolean check = true;
		for (int i = 0; i < n - 1; i++) {
			if (str.charAt(i) == 'M') {
				if (str.charAt(i + 1) != 'F') {
					check = false;
					break;
				}
			} else {
				if (str.charAt(i + 1) != 'M') {
					check = false;
					break;
				}

			}

		}

		if (check) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
