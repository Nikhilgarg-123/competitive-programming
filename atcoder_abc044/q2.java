package atcoder_abc044;

import java.util.*;
import java.io.*;

public class q2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);

		}
		boolean check = true;
		for (int i = 0; i < str.length(); i++) {
			if (map.get(str.charAt(i)) % 2 == 1) {
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
