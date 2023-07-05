package atcoder_abc304;

import java.util.*;

public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int smallest = Integer.MAX_VALUE;
		int smallind = 0;
		int[] arrnum = new int[n];
		String[] arrstr = new String[n];
		for (int i = 0; i < n; i++) {
			arrstr[i] = scn.next();
			arrnum[i] = scn.nextInt();

			int temp = arrnum[i];
			if (temp < smallest) {
				smallest = temp;
				smallind = i;
			}
		}
		for (int i = smallind; i < n; i++) {
			System.out.println(arrstr[i]);
		}
		for (int i = 0; i < smallind; i++) {
			System.out.println(arrstr[i]);
		}

	}

}
