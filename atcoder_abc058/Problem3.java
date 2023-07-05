package atcoder_abc058;

import java.util.*;

public class Problem3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int arr[][] = new int[n][26];
		for (int i = 0; i < n; i++) {
			String str = scn.next();
			for (int j = 0; j < str.length(); j++) {
				arr[i][str.charAt(j) - 'a']++;
			}
		}

		int ans[] = new int[26];

		for (int i = 0; i < 26; i++) {
			int temp = 9999;
			for (int j = 0; j < n; j++) {
				temp = Math.min(temp, arr[j][i]);
			}
			ans[i] = temp;
		}

		String aaaa = "";
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < ans[i]; j++) {
				aaaa += (char) (i + 'a');
			}
		}

		System.out.println(aaaa);
	}

}
