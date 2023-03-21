package AtCoder_abc294;

import java.util.*;

public class pb3_approch2 {
//	https://atcoder.jp/contests/abc294/tasks/abc294_c

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		int b = scn.nextInt();
		int[] arr1 = new int[a];
		int[] arr2 = new int[b];

		for (int i = 0; i < a; i++) {
			arr1[i] = scn.nextInt();
		}
		for (int i = 0; i < b; i++) {
			arr2[i] = scn.nextInt();
		}

		int count = 1;
		int i = 0;
		int j = 0;
		while (i < a && j < b) {
			if (arr1[i] <= arr2[j]) {
				arr1[i] = count;
				count++;
				i++;
			} else {
				arr2[j] = count;
				count++;
				j++;
			}
		}
		while (i < a) {
			arr1[i] = count;
			count++;
			i++;
		}
		while (j < b) {
			arr2[j] = count;
			count++;
			j++;
		}

		for (int k : arr1) {
			System.out.print(k + " ");
		}
		System.out.println();
		for (int k : arr2) {
			System.out.print(k + " ");
		}

	}

}
