package AtCoder_abc294;

//   https://atcoder.jp/contests/abc294/tasks/abc294_b

import java.util.*;

public class pb2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		int arr[][] = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				arr[i][j] = scn.nextInt();
			}
		}

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (arr[i][j] == 0) {
					System.out.print(".");
				} else {
					System.out.print((char) (arr[i][j] + 64));

				}
			}
			System.out.println();
		}

	}

}
