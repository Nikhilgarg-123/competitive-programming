package AtCoder_abc294;

import java.util.*;
import java.io.*;

public class pb4 {
	/// https://atcoder.jp/contests/abc294/tasks/abc294_d
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = br.readLine().split(" ");
		int size = Integer.parseInt(str[0]);
		int query = Integer.parseInt(str[1]);

		int check[] = new int[size + 1];
		int j = 0; // 2: x id person came to teller first time
		int k = 1; // call person who called already but not came

		while (query-- > 0) {
			String se[] = br.readLine().split(" ");
			int qq = Integer.parseInt(se[0]);

			if (qq == 1) {
			} else if (qq == 2) {
				int temp = Integer.parseInt(se[1]);

				check[temp] = 1;

			} else if (qq == 3) {
				while (check[k] == 1) {
					k++;
				}
				bw.write(k + "");
				bw.newLine();
				bw.flush();

			}

		}

	}

}
