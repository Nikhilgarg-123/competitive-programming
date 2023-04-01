package atcoder296;

import java.util.*;
import java.io.*;
// https://atcoder.jp/contests/abc296/tasks/abc296_b
public class pb2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] arr = new char[8][8];
		String ans = "";
		for (int i = 0; i < 8; i++) {
			String str = br.readLine();
			for (int j = 0; j < 8; j++) {
				arr[i][j] = str.charAt(j);
			}
		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (arr[i][j] == '*') {
					int ans1 = ('a' + j);
					ans += (char) (ans1);
					ans += 8 - i;

				}
			}
		}

		System.out.println(ans);

	}

}
