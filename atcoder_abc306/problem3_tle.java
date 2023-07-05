package atcoder_abc306;

import java.util.*;
import java.io.*;

public class problem3_tle {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int ans[] = new int[n];
		int arr[] = new int[3 * n];
		String str[] = br.readLine().split(" ");
		HashSet<Integer> ss = new HashSet<>();
		for (int i = 0; i < 3 * n; i++) {
			arr[i] = Integer.parseInt(str[i]);
			ss.add(arr[i]);
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		int k = 0;
		for (int i : ss) {
			boolean temp = false;
			for (int j = 0; j < 3 * n; j++) {
				if (temp == true && i == arr[j]) {
					ans[k] = j + 1;
					map.put(ans[k], i);
					k++;
					break;
				}
				if (i == arr[j]) {
					temp = true;
				}

			}
		}
		Arrays.sort(ans);

		for (int i : ans) {
			System.out.print(map.get(i) + " ");

		}

	}

}
