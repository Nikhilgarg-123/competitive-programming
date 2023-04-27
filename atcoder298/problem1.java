package atcoder298;

import java.util.Scanner;

public class problem1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int temp = scn.nextInt();
		String str = scn.next();
		if (str.contains("o") == true && str.contains("x") == false) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
