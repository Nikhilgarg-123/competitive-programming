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

	public boolean hasPath(String vname1, String vname2,HashMap<String,Boolean> process) {
		
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

			if (!process.containsKey(i) && hasPath(i, vname2 ,process)) {
				return true;
			}
		}

		return false;

	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
