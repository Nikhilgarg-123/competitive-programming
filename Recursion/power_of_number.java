package Recursion;

import java.util.*;
import java.io.*;

public class power_of_number {

	public static int power(int num, int pow) {
		if (pow == 0) {
			return 1;
		}
		return num * (power(num, pow - 1));
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		int c = power(a, b);
		System.out.println(c);

//		or with fast output using BufferedWriter

		String str = String.valueOf(c);
		bw.write(str);
		bw.newLine();
		bw.flush();

	}

}
