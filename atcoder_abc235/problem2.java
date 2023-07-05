package atcoder_abc235;

import java.util.*;

public class problem2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int temp = scn.nextInt();
		while (n-- > 1) {
			int temp2 = scn.nextInt();
			if (temp2 > temp) {
				temp = temp2;
			} else {
				break;
			}
		}
		System.out.println(temp);
	}
}
