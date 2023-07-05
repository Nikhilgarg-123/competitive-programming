package atcoder_abc303;

import java.util.*;

public class problem1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String str = scn.next();
		String str1 = scn.next();
		str = str.replace('l', '1');
		str1 = str1.replace('l', '1');
		str = str.replace('0', 'o');
		str1 = str1.replace('0', 'o');
		boolean check = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str1.charAt(i)) {
				check = false;
				break;
			}
		}

		if (check) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
