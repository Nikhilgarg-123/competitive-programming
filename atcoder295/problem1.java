package atcoder295;
import java.util.*;
import java.io.*;

//https://atcoder.jp/contests/abc295/tasks/abc295_a
public class problem1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int aa= Integer.parseInt(br.readLine());
		String []str= br.readLine().split(" ");
		boolean check= true;
		for(int i=0;i<aa;i++) {
		check=(	str[i].equals("and")|| str[i].equals("not")||str[i].equals("that")|| str[i].equals("the")||str[i].equals("you"));
		 	if(check==true) {
		 		break;
		 	}
		}
		if(check){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}
