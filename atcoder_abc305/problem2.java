package atcoder_abc305;

import java.util.*;

public class problem2 {

	public static void main(String[] args) {

		int temp = 0;
		int temp2 = 0;
		Scanner scn = new Scanner(System.in);
		char p = scn.next().charAt(0);
		char q = scn.next().charAt(0);

		if (p == 'A') {
			temp = 0;
		} else if (p == 'B') {
			temp = 3;
		} else if (p == 'C') {
			temp = 4;
		} else if (p == 'D') {
			temp = 8;
		} else if (p == 'E') {
			temp = 9;
		} else if (p == 'F') {
			temp = 14;
		} else if (p == 'G') {
			temp = 23;
		}

		if (q == 'A') {
			temp2 = 0;
		} else if (q == 'B') {
			temp2 = 3;
		} else if (q == 'C') {
			temp2 = 4;
		} else if (q == 'D') {
			temp2 = 8;
		} else if (q == 'E') {
			temp2 = 9;
		} else if (q == 'F') {
			temp2 = 14;
		} else if (q == 'G') {
			temp2 = 23;
		}

		int aaa = temp2 - temp;
		if (aaa > 0) {
			System.out.println(aaa);
		} else {
			System.out.println(aaa * -1);
		}
	}

}
