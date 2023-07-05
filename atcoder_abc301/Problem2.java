package atcoder_abc301;

import java.util.*;
import java.io.*;

public class Problem2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[num];
		String[] arr2 = br.readLine().split(" ");
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(arr2[i]);
		}
		int k = arr[0];

		for (int i = 1; i < num; i++) {
			while (k != arr[i]) {
				if (k > arr[i]) {
					System.out.print(k + " ");
					k--;
				} else {
					System.out.print(k + " ");
					k++;

				}
			}
		}
		System.out.println(k);

	}

}
