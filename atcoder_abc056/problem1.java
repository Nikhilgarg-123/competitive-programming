package atcoder_abc056;

import java.io.*;
public class problem1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String [] str= br.readLine().split(" ");
		if(str[0].equals(str[1])) {
			bw.write('H');
			bw.flush();
		}else {
			bw.write('D');
			bw.flush();

		}
	}

}
