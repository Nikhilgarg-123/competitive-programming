package graph_learning;

import java.util.*;

public class graphs {

	private class Vertex {
		HashMap<String, Integer> nbrs = new HashMap<>();

	}

	HashMap<String, Vertex> vtces;

	public graphs() {
		vtces = new HashMap<>();
	}

	public int number_of_vertex() {
		return this.vtces.size();
	}

	public boolean contain_vertex(String vname) {
		boolean check = this.vtces.containsKey(vname);
		return check;
	}

	public void add_vertex(String vname) {
		Vertex vtx = new Vertex();
		this.vtces.put(vname, vtx);
	}

	public void removeVertex(String vname) {
		// like i want to remove a
		// 1 . know neighbours of a
		// 2 . go to neighours and remove a from them ;
		// 3 . remove a from vtces hashmap

		Vertex vtx = vtces.get(vname);
		ArrayList<String> keys = new ArrayList<>(vtx.nbrs.keySet());
		for (String i : keys) {
			Vertex nbrvtx = vtces.get(i);
			nbrvtx.nbrs.remove(vname);

		}

		vtces.remove(vname);

	}

	public int number_of_edges() {

		ArrayList<String> keys = new ArrayList<>(vtces.keySet());
		int size = 0;
		for (String i : keys) {

			size += vtces.get(i).nbrs.size();
		}
		return size / 2;

	}

	public boolean containsEdge(String vname1, String vname2) {
		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);

		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return false;
		}
		return true;
	}

	public void addEdge(String vname1, String vname2, int cost) {
		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);

		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)) {
			return;
		}

		vtx1.nbrs.put(vname2, cost);
		vtx2.nbrs.put(vname1, cost);

	}

	public void removeEdge(String vname1, String vname2) {
		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);

		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		vtx1.nbrs.remove(vname2);
		vtx2.nbrs.remove(vname1);

	}

	public void display() {

		System.out.println("-------------------------");

		ArrayList<String> keys = new ArrayList<>(vtces.keySet());
		for (String i : keys) {
			Vertex vtx = vtces.get(i);
			System.out.println(i + " : " + vtx.nbrs);
		}
		System.out.println("-------------------------");
	}

	public boolean hasPath(String vname1, String vname2, HashMap<String, Boolean> process) {

		process.put(vname1, true);
		// direct edge

		if (containsEdge(vname1, vname2)) {
			return true;
		}

		// a ke neighbours dekho edge hai
		// devote work to neighbours

		Vertex vtx = vtces.get(vname1);

		ArrayList<String> nbrs = new ArrayList<>(vtx.nbrs.keySet());

		for (String i : nbrs) {

			if (!process.containsKey(i) && hasPath(i, vname2, process)) {
				return true;
			}
		}

		return false;

	}

	// BFS (BREADTH FIRST SEARCH ) - similar to level order traversal of tree

	// DEFINATION OF BFS

	// algorithm for searching in graph data Structure . It starts from 'SRC'
	// node and neighbour nodes at the present depth prior to moving on to the
	// nodes at next depth level.
// 		
//		MOST IMPORTANT POINT	
//////	BFS always give us shortest path
//
	private class Pair {
		String vname;
		String psf;
	}

	// Linked list can be used as Stack and Queue
	// AddFirst ---------- O(1)
	// addLast -----------O(1)
	// removeFirst ------O(1)
	// removelast -------O(n)

//	Queue bnane ke liye 2 methods huye 

//	AddFirst O(1)		|  addLast O(1)
//	RemoveLast O(n) 	|  removeFirst O(1)

	// Here method 2 is better as it can do work in O(1) So we will use method 2

//	
////	Stack bnane ke liye 2 methods huye 
//
////	AddFirst O(1)		|  addLast O(1)
////	RemoveFirst O(1) 	|  removeLast O(n)
//	
//	// Here method 1 is better as it can do work in O(1) So we will use method 1
//	

	public boolean BFS(String src, String des) {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> queue = new LinkedList<>();

		// create a new Pair
		Pair sp = new Pair();
		sp.vname = src;
		sp.psf = src;

		// Put the new Pair in queue

		queue.addLast(sp);

		// while queue is not empty keep on doing the work
		while (!queue.isEmpty()) {
			// remove pair from queue
			Pair rp = queue.removeFirst();
			// check koi dubara toh nahi aara means jaise kisi mai cycle hai
//			toh ek element hi do baar aa skta     

//				 a
//				/ \          jaise  ider a to d hai toh  abd  and acd
//				   b   c         2 raste bane toh isliye check karna padega
//				    \  /
//				     d

			if (processed.containsKey(rp.vname)) {
				continue;
			}

			// Processed put
			processed.put(rp.vname, true);

			// direct edge check

			if (containsEdge(rp.vname, des)) {
				// print pathsofar
				System.out.println("Path = " + rp.psf + des);

				return true;
			}

			// nbrs
			Vertex rpvtx = vtces.get(rp.vname);
			ArrayList<String> keys = new ArrayList<>(rpvtx.nbrs.keySet());

			// loop for keys
			for (String i : keys) {

				// process only unprocessed ones (nani toh infinite loop lag jani)
				if (!processed.containsKey(i)) {
					// make a new pair of neighbour
					Pair np = new Pair();
					np.vname = i;
					np.psf = rp.psf + i;
					// add in queue
					queue.addLast(np);
				}

			}

		}
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
