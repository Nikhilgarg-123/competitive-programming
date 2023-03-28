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

	public int number_of_edges() {

		ArrayList<String> keys = new ArrayList<>(vtces.keySet());
		int size = 0;
		for (String i : keys) {

			size += vtces.get(i).nbrs.size();
		}
		return size/2;

	}

	public boolean containsEdge(String vname1, String vname2) {
		Vertex vtx1= vtces.get(vname1);
		Vertex vtx2= vtces.get(vname2);
		
		if(vtx1==null || vtx2==null || !vtx1.nbrs.containsKey(vname2)) {
			return false;
		}
		return true;
	}

	public void addEdge(String vname1, String vname2, int cost) {

	}

	public void removeEdge(String vname1, String vname2) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
