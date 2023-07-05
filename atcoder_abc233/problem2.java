package atcoder_abc233;

import java.util.*;
public class problem2 {
	public static String reverse(int a,int b, String str) {
		String aaa= str.substring(a-1, b);
		 StringBuilder sb=new StringBuilder(aaa);  
		    sb.reverse();  
		    String temp= sb.toString();  
			
		String ans= str.substring(0,a-1)+temp+str.substring(b);	
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str="abcdefgh";
		System.out.println(reverse(3, 7, str));
		
		
	}

}
