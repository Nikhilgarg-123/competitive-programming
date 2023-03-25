package Segment_tree;

import java.util.*;

public class min_query_range {

	public static void buildtree(int[] arr, int s, int e, int[] tree, int index) {
		if (s == e) {
			tree[index] = arr[s];
			return;

		}

		int mid = (s + e) / 2;
		buildtree(arr, s, mid, tree, 2 * index);
		buildtree(arr, mid + 1, e, tree, 2 * index + 1);
		tree[index] = Math.min(tree[2 * index], tree[2 * index + 1]);
		return;

	}

	public static int query(int[] tree, int ss, int se, int qs, int qe, int index) {
		// ss= start of segment tree;
		// se = end of segment tree;
		// qs = start of query
		// qe = end of query

		// complete overlap
		if (ss >= qs && se <= qe) {
			return tree[index];
		}

		// No overlap
		if (qe < ss || qs > se) {
			return Integer.MAX_VALUE;
		}

		// partial overlap
		int mid = (ss + se) / 2;
		int left = query(tree, ss, mid, qs, qe, 2 * index);
		int right = query(tree, mid + 1, se, qs, qe, 2 * index + 1);
		return (Math.min(left, right));

	}
	
	// Point Update 
	public static void updateNode(int [] tree, int ss , int se , int i , int new_val,int index) {
		
		// Case where I is out of bounds
		if(i>se || i<ss) {
			return;
		}
		
		// leaf node 
		
		if(ss==se) {
			tree[index]= new_val;
			return;
		}
		
		// otherwise
		
		int mid=(ss+se)/2;
		updateNode(tree,ss,mid,i,new_val,2*index);
		updateNode(tree,mid+1,se,i,new_val,2*index);
		tree[index]= Math.min(tree[2*index], tree[2*index+1]);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 2, -5, 6, 4 };
		int n = arr.length;
		int tree[] = new int[4 * n + 1];
		buildtree(arr, 0, n - 1, tree, 1);
//		for (int i : tree) {
//			System.out.println(i + " ");
//		}

//		Scanner scn = new Scanner(System.in);
//		int q = scn.nextInt();
//		while (q-- > 0) {
//			int l = scn.nextInt();
//			int r = scn.nextInt();
//			System.out.println(query(tree, 0, n - 1, l, r, 1));
//		}
		
		updateNode(tree,0,n-1,3,5,1);
		for (int i : tree) {
			System.out.println(i + " ");
		}

	}

}
