package atcoder_abc056;

import java.util.*;

public class problem3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 0;
		while (((i) * (i + 1) / 2) < n) {
			i++;
		}
		System.out.println(i);
	}

}
