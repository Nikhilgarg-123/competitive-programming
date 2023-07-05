package atcoder_abc302;

import java.io.*;
import java.util.*;

public class problem_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		long a = Long.parseLong(arr[0]);
		long b = Long.parseLong(arr[1]);

		long count = a / b;
		long rem = a % b;
		if (rem > 0) {
			count++;
		}
		System.out.println(count);

	}

}
