package atcoder_abc061;

import java.util.*;

public class Problem3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long k = scn.nextLong();
		HashMap<Integer, Long> map = new HashMap<>();

		long temp = 0;
		while (n-- > 0) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			if (map.containsKey(a)) {
				long t = map.get(a);
				t += b;
				map.put(a, t);
			} else {
				long t = b;
				map.put(a, t);
			}

		}
//		System.out.println(map);
		ArrayList<Integer> al = new ArrayList<>(map.keySet());
		int zz = 0;
		Collections.sort(al);
		while (temp < k) {
			temp += map.get(al.get(zz));
			zz++;

		}
		System.out.println(al.get(zz - 1));

	}

}
