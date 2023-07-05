package atcoder_abc061;

import java.util.*;

public class Problem1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		if (c >= a && c <= b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
