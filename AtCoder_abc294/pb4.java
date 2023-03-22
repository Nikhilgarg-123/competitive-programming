package AtCoder_abc294;

import java.util.*;
//    2 test cases failed
public class pb4 {
  ///   https://atcoder.jp/contests/abc294/tasks/abc294_d
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int query = scn.nextInt();
		int check[] = new int[size+1];
		int i = 0; // 1: smallest id not called
		int j = 0; // 2: x id person came to teller first time
		int k = 1; // call person who called already but not came

		while (query-- > 0) {
			int qq = scn.nextInt();
			if (qq == 1) {
			} else if (qq == 2) {
				int temp = scn.nextInt();
				check[temp] = 1;

			} else if (qq == 3) {
				while ( check[k] == 1) {
					k++;
				}
				System.out.println(k);



			}

		}

	}

}
