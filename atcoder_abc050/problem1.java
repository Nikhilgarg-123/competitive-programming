package atcoder_abc050;

import java.util.*;

public class problem1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		String op = scn.next();
		int b = scn.nextInt();

		if (op.equals("+")) {
			System.out.println(a + b);
		} else {
			System.out.println(a - b);
		}
	}

}
