package atcoder_abc056;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		if (b < c) {
			int temp = c - a - b;
			if (temp >= 0) {
				System.out.println(temp);
			} else {
				System.out.println(0);
			}
		} else {
			int temp = b - a - c;
			if (temp >= 0) {
				System.out.println(temp);
			} else {
				System.out.println(0);
			}

		}
	}

}
