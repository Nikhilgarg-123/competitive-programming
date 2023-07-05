package atcoder_abc053;

import java.util.*;
import java.io.*;

public class problem2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int count = 0;
		int ans = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A') {
				while (i < str.length()) {
					if (str.charAt(i) != 'Z') {

						count++;
						i++;
					} else {
						count++;
						ans = Math.max(ans, count);
						i++;
					}
				}
				count++;
				break;
			}
		}

		System.out.println(ans);
	}
}
