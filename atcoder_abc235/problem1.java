package atcoder_abc235;

import java.util.*;

public class problem1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int n2 = ((n % 100) * 10) + (n / 100);
		int n3 = ((n2 % 100) * 10) + (n2 / 100);
		int sum = n + n2 + n3;
		System.out.println(sum);
	}
}
