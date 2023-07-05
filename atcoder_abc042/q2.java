package atcoder_abc042;

import java.util.*;
import java.io.*;

public class q2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int l = Integer.parseInt(temp[1]);

		String[] str = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = br.readLine();
		}
		Arrays.sort(str);
		for (int i = 0; i < n; i++) {
			System.out.print(str[i]);
		}

	}

}
