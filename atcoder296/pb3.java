package atcoder296;

import java.util.*;
import java.io.*;

// https://atcoder.jp/contests/abc296/tasks/abc296_c
public class pb3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int x = scn.nextInt();
		boolean check = true;
		int arr[] = new int[n];
		if (x == 0) {
			System.out.println("Yes");
			System.exit(0);
		}
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			int temp = scn.nextInt();
			if (map.containsKey(temp - x) || map.containsKey(temp + x)) {
				check = false;
				break;
			}
				map.put(temp, 1);

		}
		if (check == false) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
