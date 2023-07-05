package atcoder_abc306;

import java.util.*;
import java.math.*;
import java.io.*;

public class problem2 {

	public static void main(String[] args) {
		BigInteger two = new BigInteger("2");
		BigInteger sum = new BigInteger("0");
		BigInteger twopower = new BigInteger("1");
		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < 64; i++) {
			int temp = scn.nextInt();
//			sum += (temp * twopower);

			if (temp == 1) {
				sum = sum.add(twopower);

			}
			twopower = twopower.multiply(two);
		}
		System.out.println(sum);

	}

}
