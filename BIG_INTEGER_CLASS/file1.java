package BIG_INTEGER_CLASS;

import java.util.*;
import java.math.*;
import java.io.*;

public class file1 {

	public static void main(String[] args) throws IOException {
		//
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		String str1 = br.readLine();
		
		BigInteger b1 = new BigInteger(str);
		BigInteger b2 = new BigInteger(str1);
		int b= Integer.parseInt(br.readLine());
		System.out.println(b1.add(b2));
		System.out.println(b1.multiply(b2));
		System.out.println(b1.bitCount());
		System.out.println(b1.setBit(5));
		
		
		
		BigInteger b3= BigInteger.valueOf(b);
		System.out.println(b3);
		//
	}

}
