package atcoder_abc300;

import java.util.*;
import java.io.*;

public class q1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int a = Integer.parseInt(str[1]);
		int b = Integer.parseInt(str[2]);
		int c = a + b;

		Integer[] arr = new Integer[n];
		String[] temp = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(temp[i]);
			if (arr[i] == c) {
				System.out.println(i + 1);
				break;
			}
		}

	}

}
