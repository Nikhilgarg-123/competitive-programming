package AtCoder_abc294;

import java.util.Scanner;

public class pb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int arr[] = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = scn.nextInt();
		}

		for (int i : arr) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
