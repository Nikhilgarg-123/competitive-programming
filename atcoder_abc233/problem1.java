package atcoder_abc233;

import java.util.*;

public class problem1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();

		int diff = y - x;
		if (diff < 0) {
			diff = 0;
		}
		if (diff % 10 == 0) {
			System.out.println(diff / 10);
		} else {
			System.out.println((diff / 10) + 1);

		}

	}

}
