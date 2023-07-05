package atcoder_abc048;

import java.util.*;

public class problem1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] str = new String[3];
		for (int i = 0; i < 3; i++) {
			str[i] = scn.next();
		}
		char temp = str[1].charAt(0);
		if (temp >= 'A' && temp <= 'Z') {

			System.out.println("A" + temp + "C");
		}

	}

}
