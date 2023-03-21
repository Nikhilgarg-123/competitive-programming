package AtCoder_abc294;

import java.util.*;

public class pb3 {
//		https://atcoder.jp/contests/abc294/tasks/abc294_c
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int qq = scn.nextInt();
		int ww = scn.nextInt();
		int arr1[] = new int[qq];
		int arr2[] = new int[ww];
		int arr[] = new int[qq + ww];
		for (int i = 0; i < qq; i++) {
			arr1[i] = scn.nextInt();
			arr[i] = arr1[i];
		}

		for (int i = 0; i < ww; i++) {
			arr2[i] = scn.nextInt();
			arr[i + qq] = arr2[i];
		}

		Arrays.sort(arr);
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < qq + ww; i++) {
			map.put(arr[i], i + 1);
		}

		for (int i = 0; i < qq; i++) {
			arr1[i] = map.get(arr1[i]);
		}
		for (int i = 0; i < ww; i++) {
			arr2[i] = map.get(arr2[i]);
		}

		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : arr2) {
			System.out.print(i + " ");
		}

	}

}
