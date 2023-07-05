package atcoder_abc055;
import java.util.Scanner;
import java.io.*;
public class problem2 {
		public static void main(String[] args) throws IOException{
		
//		Scanner sc=new Scanner(System.in);
		
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt(br.readLine());
		
		long fact=1;
		n=n+1;
		while(n-->1) {
			fact=fact*n;
			if(fact>Integer.MAX_VALUE) {
			fact%=1000000007;
			}
		}
			System.out.println(fact);
		
	}

}
