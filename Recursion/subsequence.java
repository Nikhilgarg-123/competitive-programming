package Recursion;

import java.util.*;

public class subsequence {

	public static void subsequence(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char temp = str.charAt(0);
		String rem = str.substring(1);

		subsequence(rem, ans);
		subsequence(rem, ans + temp);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String ans = "";

		subsequence(str, ans);

	}

}
