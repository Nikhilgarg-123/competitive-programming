package atcoder_abc059;

import java.util.Scanner;
import java.io.*;

public class Problem1 {

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		System.out.print((char) (str[0].charAt(0) - 32));
		System.out.print((char) (str[1].charAt(0) - 32));
		System.out.println((char) (str[2].charAt(0) - 32));
	}

}
