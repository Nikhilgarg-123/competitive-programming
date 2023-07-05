package atcoder_abc049;

import java.util.*;

public class problem3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		str = str.replace("eraser", "");
		str = str.replace("erase", "");
		str = str.replace("dreamer", "");
		str = str.replace("dream", "");

		if (str.length() == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
