package atcoder_abc055;
import java.util.Scanner;
public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=n*800;
		int div=(n/15)*200;
		System.out.println(res-div);
	}

}
