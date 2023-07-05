package atcoder_abc044;

import java.util.*;
import java.io.*;

public class q1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		if (n <= k) {
			System.out.println(n * x);

		} else {
			int temp = n - k;
			long ans = k * x + temp * y;
			System.out.println(ans);
		}
	}

}
