package AtCoder_abc294;
import java.util.*;
import java.io.*;
public class pb5 {

	public static void main(String[] args) throws IOException{
		Scanner scn= new Scanner(System.in);
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		long size=scn.nextLong();
		int a=scn.nextInt();
		int b=scn.nextInt();
		
		ArrayList<Integer>arr=new ArrayList<>();
		ArrayList<Integer>arr1=new ArrayList<>();
		
		int count=0;
		while(a-->0) {
			int num1=scn.nextInt();
			long num2=scn.nextLong();
			
			for(int i=0;i<num2;i++) {
				arr.add(num1);
			}	
			
		}
		while(b-->0) {
			int num1=scn.nextInt();
			long num2=scn.nextLong();
			
			for(int i=0;i<num2;i++) {
				arr1.add(num1);
			}	
			
		}
		
		for(int i=0;i<size;i++) {
			if(arr.get(i)==arr1.get(i)) {
				count++;
			}
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
		
	}

}
