package atcoder_abc304;

import java.util.*;

public class Problem3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num_per = scn.nextInt();
		int dis= scn.nextInt();
		
		int []x= new int[num_per];
		int []y= new int[num_per];
		int []check= new int[num_per];
		check[0]=1;
		for(int i=0;i<num_per;i++) {
			x[i]=scn.nextInt();
			y[i]= scn.nextInt();	
		}
		
		for(int i=0;i<num_per;i++){
			int tempx= x[i];
			int tempy= y[i];
			for(int j=0;j<i;j++) {
				if(check[j]==1) {
					int temp1= tempx-x[j];
					int temp2= tempy-y[j];
					
					if((Math.sqrt( (temp1*temp1) +(temp2*temp2)))<=dis ) {
						check[i]=1;
						
					}
				}
			}
		}
		

		for(int i:check) {
			if(i==1) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
		
	}

}
