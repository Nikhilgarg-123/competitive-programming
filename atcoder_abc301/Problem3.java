package atcoder_abc301;

import java.util.*;
import java.io.*;
public class Problem3 {

	public static void main(String[] args) throws IOException{
		Scanner scn = new Scanner(System.in);
		String  str1= scn.next();
		String  str2= scn.next();
		char array[] = str1.toCharArray();
		char array1[] = str2.toCharArray();
		
		Arrays.sort(array);
		Arrays.sort(array1);

		System.out.println(array);

		System.out.println(array1);
		
		
		
//		HashMap<Character,Integer> map= new HashMap<>();
//		
//		for(int i=0;i<str1.length();i++) {
//			map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0)+1);
//			
//		}
//		
		
//		String rem="";
//		for(int i=0;i<str2.length();i++) {
//			if(map.containsKey(str2.charAt(i))) {
//				int temp=map.get(str2.charAt(i));
//				if(temp>1) {
//					temp--;
//					map.put(str2.charAt(i), temp);
//				}else {
//					map.remove(str2.charAt(i));
//				}
//			}else {
//				rem+=str2.charAt(i);
//			}
//			
//		}
//		System.out.println(map);
//		System.out.println(rem);
		
		
	}

}
