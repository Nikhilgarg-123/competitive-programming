package atcoder_abc299;

import java.util.*;

public class q1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String str = scn.next();
		boolean check = false;
		boolean ans = true;
		boolean temp = false;
		for (int i = 0; i < str.length(); i++) {
			if (check == false && temp == false) {

				if (str.charAt(i) == '|') {
					check = true;
				}
				if (str.charAt(i) == '*') {
					System.out.println("in");
					break;
				}

			}

			else if (check == true || temp == true) {
				if (str.charAt(i) == '|') {
					check = false;
					temp = true;
				}
				if (str.charAt(i) == '*' && check == false) {
					System.out.println("out");
					break;
				}
				if (str.charAt(i) == '*' && check == true) {
					System.out.println("in");
					break;
				}

			}

		}

	}

}
