package atcoder_abc308;

import java.util.*;

public class Problem1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[8];
		boolean multipleof25 = true;
		for (int i = 0; i < 8; i++) {
			arr[i] = scn.nextInt();

		}
		int temp = arr[0];

		for (int i = 0; i < 8; i++) {

			if (arr[i] % 25 == 0 && arr[i] >=100 && arr[i] < 675 && arr[i] >= temp) {
				temp = arr[i];
			} else {
				System.out.println("No");
				System.exit(0);
			}
		}

		System.out.println("Yes");

	}

}
