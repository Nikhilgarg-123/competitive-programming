package atcoder_abc050;

import java.util.*;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0;
		int[] t = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = scn.nextInt();
			sum += t[i];
		}
		int m = scn.nextInt();
		while (m-- > 0) {
			int p = scn.nextInt();
			int x = scn.nextInt();
			int temp = sum;
			temp = temp - t[p - 1];
			temp += x;
			System.out.println(temp);
		}
	}

}
