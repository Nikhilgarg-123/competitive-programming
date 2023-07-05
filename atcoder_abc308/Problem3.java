package atcoder_abc308;

import java.util.*;

public class Problem3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		double value[] = new double[n];
		for (int i = 0; i < n; i++) {
			double a = scn.nextInt();
			double b = scn.nextInt();
			value[i] = (a / (a + b));
		}

		HashMap<Double, ArrayList<Integer>> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(value[i]) == false) {
				ArrayList<Integer> arr = new ArrayList<>();
				arr.add(i);
				map.put(value[i], arr);
			} else {
				ArrayList<Integer> arr = map.get(value[i]);
				arr.add(i);
				map.put(value[i], arr);
			}
		}

//		System.out.println(map);
		ArrayList<Double> arr = new ArrayList<>(map.keySet());
		Collections.sort(arr, Collections.reverseOrder());
		for (double i : arr) {
			ArrayList<Integer> al = map.get(i);
			for (int j : al) {
				System.out.print((j + 1) + " ");
			}
		}

	}

}
