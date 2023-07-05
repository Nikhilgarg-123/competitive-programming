package atcoder_abc060;

import java.util.*;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		long temp = 0;
		int i = 0;
		boolean check = false;
		while (temp < 9999999) {
			if (((b * i) + c) % a == 0) {
				check = true;
				break;
			}
			i++;
			temp = (b * i) + c;
		}
//		System.out.println(i);
		if (check) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
