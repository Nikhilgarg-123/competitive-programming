package atcoder_abc236;

import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String ng = scn.next();
		int a = scn.nextInt();
		int b = scn.nextInt();
		String str = "";
		str += ng.substring(0, a - 1);
		str += ng.charAt(b - 1);
		str += ng.substring(a, b - 1);
		str += ng.charAt(a - 1);
		str += ng.substring(b);

		System.out.println(str);

	}

}
