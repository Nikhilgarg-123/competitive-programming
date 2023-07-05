package atcoder_abc302;

import java.util.*;
import java.io.*;

public class problem2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] temp = br.readLine().split(" ");
		int x = Integer.parseInt(temp[0]);
		int y = Integer.parseInt(temp[1]);
		char[][] arr = new char[x][y];
		for (int i = 0; i < x; i++) {
			String str = br.readLine();
			for (int j = 0; j < y; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		int ans = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (arr[i][j] == 's') {
					if ((i + 4) < x && (j + 4) < y && arr[i + 1][j + 1] == 'n' && arr[i + 2][j + 2] == 'u'
							&& arr[i + 3][j + 3] == 'k' && arr[i + 4][j + 4] == 'e') {
						i++;
						j++;
						System.out.println(i + " " + j);
						System.out.println((i + 1) + " " + (j + 1));
						System.out.println((i + 2) + " " + (j + 2));
						System.out.println((i + 3) + " " + (j + 3));
						System.out.println((i + 4) + " " + (j + 4));
						break;

					} else if ((i + 4) < x && arr[i + 1][j] == 'n' && arr[i + 2][j] == 'u' && arr[i + 3][j] == 'k'
							&& arr[i + 4][j] == 'e') {
						i++;
						j++;
						System.out.println(i + " " + j);
						System.out.println((i + 1) + " " + j);
						System.out.println((i + 2) + " " + j);
						System.out.println((i + 3) + " " + j);
						System.out.println((i + 4) + " " + j);
						break;
					} else if ((j + 4) < y && arr[i][j + 1] == 'n' && arr[i][j + 2] == 'u' && arr[i][j + 3] == 'k'
							&& arr[i][j + 4] == 'e') {
						i++;
						j++;
						System.out.println(i + " " + j);
						System.out.println(i + " " + (j + 1));
						System.out.println(i + " " + (j + 2));
						System.out.println(i + " " + (j + 3));
						System.out.println(i + " " + (j + 4));
						break;
					}

					else if (i - 4 >= 0 && j - 4 >= 0 && arr[i - 1][j - 1] == 'n' && arr[i - 2][j - 2] == 'u'
							&& arr[i - 3][j - 3] == 'k' && arr[i - 4][j - 4] == 'e') {
						i++;
						j++;
						System.out.println(i + " " + j);
						System.out.println((i - 1) + " " + (j - 1));
						System.out.println((i - 2) + " " + (j - 2));
						System.out.println((i - 3) + " " + (j - 3));
						System.out.println((i - 4) + " " + (j - 4));
						break;

					}

					else if (i - 4 >= 0 && arr[i - 1][j] == 'n' && arr[i - 2][j] == 'u' && arr[i - 3][j] == 'k'
							&& arr[i - 4][j] == 'e') {
						i++;
						j++;
						System.out.println(i + " " + j);
						System.out.println((i - 1) + " " + (j));
						System.out.println((i - 2) + " " + (j));
						System.out.println((i - 3) + " " + (j));
						System.out.println((i - 4) + " " + (j));
						break;


					} else if (j - 4 >= 0 && arr[i][j - 1] == 'n' && arr[i][j - 2] == 'u' && arr[i][j - 3] == 'k'
							&& arr[i][j - 4] == 'e') {
						i++;
						j++;
						System.out.println(i + " " + j);
						System.out.println((i) + " " + (j - 1));
						System.out.println((i) + " " + (j - 2));
						System.out.println((i) + " " + (j - 3));
						System.out.println((i) + " " + (j - 4));
						break;


					} else if (i - 4 >= 0 && j + 4 < y && arr[i - 1][j + 1] == 'n' && arr[i - 2][j + 2] == 'u'
							&& arr[i - 3][j + 3] == 'k' && arr[i - 4][j + 4] == 'e') {
						i++;
						j++;
						System.out.println(i + " " + j);
						System.out.println((i - 1) + " " + (j + 1));
						System.out.println((i - 2) + " " + (j + 2));
						System.out.println((i - 3) + " " + (j + 3));
						System.out.println((i - 4) + " " + (j + 4));
						break;

					} else if (j - 4 >= 0 && i + 4 < x && arr[i + 1][j - 1] == 'n' && arr[i + 2][j - 2] == 'u'
							&& arr[i + 3][j - 3] == 'k' && arr[i + 4][j - 4] == 'e') {
						i++;
						j++;
						System.out.println(i + " " + j);
						System.out.println((i + 1) + " " + (j - 1));
						System.out.println((i + 2) + " " + (j - 2));
						System.out.println((i + 3) + " " + (j - 3));
						System.out.println((i + 4) + " " + (j - 4));
						break;

					}

				} // if

			}
		}

	}
}
