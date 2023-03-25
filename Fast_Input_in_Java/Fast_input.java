package Fast_Input_in_Java;

import java.util.*;
import java.io.*;

public class Fast_input {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine();
		int n= Integer.parseInt(br.readLine());
		
		System.out.println(str +"  " + n);
	}
}
