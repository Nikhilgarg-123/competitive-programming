package atcoder297;

import java.util.Scanner;

public class problem_c {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int m= scn.nextInt();
		while(n-->0) {
			String str=scn.next();
		
			for(int i=0;i<m-1;i++) {
				if(str.charAt(i)=='T' && str.charAt(i+1)=='T' ) {
					str= str.substring(0,i)+"PC"+str.substring(i+2);
				}
				
				
			}
			System.out.println(str);
		}
	}

}
