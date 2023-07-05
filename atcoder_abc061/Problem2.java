package atcoder_abc061;

import java.util.*;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
//			int arr[] = new int[n];
		while (m-- > 0) {
			int a = scn.nextInt();
			int b = scn.nextInt();
//			arr[a - 1]++;
//			arr[b - 1]++;
			map.put(a, map.getOrDefault(a, 0) + 1);
			map.put(b, map.getOrDefault(b, 0) + 1);

		}

		for (int i = 1; i <= n; i++) {
			if (map.containsKey(i)) {

				System.out.println(map.get(i));
			} else {
				System.out.println(0);
			}
		}
		
//		for (int i : arr) {
//			System.out.println(i);
//		}

	}

}
