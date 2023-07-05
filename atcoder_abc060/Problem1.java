package atcoder_abc060;

import java.util.*;
import java.io.*;

public class Problem1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		if (str[0].charAt(str[0].length() - 1) == str[1].charAt(0)
				&& str[1].charAt(str[1].length() - 1) == str[2].charAt(0)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
