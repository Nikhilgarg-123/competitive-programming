package atcoder_abc048;

import java.util.*;

public class problem2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong();
		long b = scn.nextLong();
		long x = scn.nextLong();
		long count = 0;
		long temp = b / x;
		long temp2 = a / x;
		if (a % x == 0) {
			System.out.println(temp - temp2 + 1);
		} else {
			System.out.println(temp - temp2);
		}

	}

}
