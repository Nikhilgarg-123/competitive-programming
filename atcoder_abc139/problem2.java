package atcoder_abc139;

import java.util.*;

public class problem2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int n = 0;
		while ((a - 1) * n + 1 < b) {
			n++;
		}
		System.out.println(n);
	}

}
