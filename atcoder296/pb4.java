package atcoder296;

import java.util.*;

public class pb4 {
	// https://atcoder.jp/contests/abc296/tasks/abc296_d

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		long n = scn.nextLong();
		long x = scn.nextLong();
		long s=1;
		long e=n;
		long ans=-1;
		while(s<e) {
			long res= s*e;
			if(res>=x) {
				ans=res;
				e--;
			}
			else {
				s++;
			}
		}
		System.out.println(ans);

		
	}
}
