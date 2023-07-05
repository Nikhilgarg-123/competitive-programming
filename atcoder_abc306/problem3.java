package atcoder_abc306;

import java.util.*;
public class problem3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int arr[]= new int[3*n];
		HashMap<Integer,Integer>map= new HashMap<>();
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0;i<3*n;i++) {
			int temp=scn.nextInt();
			if(map.containsKey(temp)==true && map.get(temp)==0) {
				al.add(temp);
				map.put(temp, 1);
			}
			if(map.containsKey(temp)==false) {
				map.put(temp,0);
			}
			
	
		}
		
		for(int i:al) {
			System.out.print(i+" ");
		}
//		
	}

}
