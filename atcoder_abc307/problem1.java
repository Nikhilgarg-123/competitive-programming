package atcoder_abc307;

import java.util.*;

public class problem1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		while (n-- > 0) {
			long sum = 0;
			for (int i = 0; i < 7; i++) {
				int temp = scn.nextInt();
				sum += temp;
			}
			System.out.print(sum + " ");
		}
	}
}
