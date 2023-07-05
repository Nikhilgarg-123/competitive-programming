package atcoder_abc300;

import java.util.*;
import java.io.*;
public class q2 {

	public static void main(String[] args) throws IOException{
		Scanner scn = new Scanner(System.in);
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String [] temp= br.readLine().split(" ");
		int h= Integer.parseInt(temp[0]);
		int w= Integer.parseInt(temp[1]);
		
		int dot=0;
		int hash=0;
		
		for(int i=0;i<h;i++) {
			String str=br.readLine();
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)=='.') {
					dot++;
				}else {
					hash++;
				}
			}
		}
		int dotc=0;
		int hashc=0;
		for(int i=0;i<h;i++) {
			String str=br.readLine();
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)=='.') {
					dotc++;
				}else {
					hashc++;
				}
			}
		}
		
		
		if(dot==dotc && hash==hashc) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
