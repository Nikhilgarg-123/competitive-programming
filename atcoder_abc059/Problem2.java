package atcoder_abc059;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Problem2 {

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		String str1 = scn.next();
		String str2 = scn.next();

		BigInteger b1 = new BigInteger(str1);
		BigInteger b2 = new BigInteger(str2);

		if (b1.compareTo(b2) == 1) {
			System.out.println("GREATER");
		} else if (b1.compareTo(b2) == -1) {
			System.out.println("LESS");
		} else {
			System.out.println("EQUAL");
		}

	}

}
