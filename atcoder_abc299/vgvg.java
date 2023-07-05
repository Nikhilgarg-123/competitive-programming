package atcoder_abc299;
import  java.util.*;
public class vgvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scn= new Scanner(System.in);
	int n=scn.nextInt();
		String s = scn.next();
		int si = 0;
		int ei = s.length()-1;
		
		boolean flag = false;
		for(int i= si; i <= ei; i++)
		{
			if(s.charAt(i)== '|')
			{
				flag = !flag;
			}
			if(s.charAt(i) == '*')
			{
				if(flag==true) {
					System.out.println("in");
				}else {
					System.out.println("out");
				}
				break;
			}
		}

	}

}
