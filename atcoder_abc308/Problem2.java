package atcoder_abc308;

import java.util.*;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int ans = 0;
		String arr[] = new String[n];
		String arr2[] = new String[m];
		Integer valuees[] = new Integer[m + 1];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.next();
		}
		for (int i = 0; i < m; i++) {
			arr2[i] = scn.next();
		}

		for (int i = 0; i < (m + 1); i++) {
			valuees[i] = scn.nextInt();
		}

		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < m; i++) {
			map.put(arr2[i], valuees[i + 1]);
		}
		for (int i = 0; i < n; i++) {
			String temp = arr[i];
			if (map.containsKey(temp) == true) {
				ans += map.get(temp);
			} else {
				ans += valuees[0];
			}

		}
		System.out.println(ans);

	}

}
