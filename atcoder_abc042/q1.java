package atcoder_abc042;

import java.util.*;
import java.io.*;

public class q1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);

		int count_5 = 0;
		int count_7 = 0;

		if (a == 5) {
			count_5++;

		}
		if (a == 7) {
			count_7++;

		}
		if (b == 5) {
			count_5++;

		}
		if (b == 7) {
			count_7++;

		}
		if (c == 5) {
			count_5++;

		}
		if (c == 7) {
			count_7++;

		}

		if (count_5 == 2 && count_7 == 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
