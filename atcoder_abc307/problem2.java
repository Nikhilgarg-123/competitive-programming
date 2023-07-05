package atcoder_abc307;

import java.util.*;

public class problem2 {

	public static boolean ispalindrome(String str) {
		int start = 0;
		int end = str.length() - 1;
		while (start <= end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String arr[] = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.next();
		}
		boolean check = false;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				String temp = arr[i] + arr[j];

				boolean aaa = ispalindrome(temp);
				if (aaa == true) {
					System.out.println("Yes");
					return;
				}
				temp = arr[j] + arr[i];
				aaa = ispalindrome(temp);
				if (aaa == true) {
					System.out.println("Yes");
					return;
				}

			}
		}
		System.out.println("No");

	}

}
