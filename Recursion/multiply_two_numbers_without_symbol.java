package Recursion;
import java.util.*;
import java.io.*;
public class multiply_two_numbers_without_symbol {

	public static int multiply(int a ,int b) {
		if(b==0) {
			return 0;
		}
		return a+multiply(a, b-1);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a= Integer.parseInt(br.readLine());
		int b= Integer.parseInt(br.readLine());
		int c=multiply(a, b);
		
		System.out.println(c);
//		 or With bufferedWriter with fast output
		String str=String.valueOf(c);
		bw.write(str);
		bw.flush();
		
		

	}

}
