package atcoder_abc301;

import java.util.*;
import java.io.*;
public class Problem1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(br.readLine());
		String str= br.readLine();
		int t=0;
		int a=0;
		char ans='q';
		for(int i=0;i<num;i++) {
			if(str.charAt(i)=='T') {
				t++;
			}else {
				a++;
			}
			
			if(t>a) {
				ans='T';
			}
			if(t<a) {
				ans='A';
			}
		}
		System.out.println(ans);
		

	}

}
