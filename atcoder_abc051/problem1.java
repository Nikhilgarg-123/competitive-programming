package atcoder_abc051;

import java.util.*;

public class problem1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ',') {
				System.out.print(" ");
			} else {
				System.out.print(str.charAt(i));
			}
		}

	}

}
