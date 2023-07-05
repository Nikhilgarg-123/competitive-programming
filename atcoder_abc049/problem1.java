package atcoder_abc049;

import java.util.*;

public class problem1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		char ch = str.charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("vowel");
		} else {
			System.out.println("consonant");
		}
	}

}
