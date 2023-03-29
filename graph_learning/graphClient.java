package graph_learning;

import java.util.*;

public class graphClient {

	public static void main(String[] args) {
		graphs grp = new graphs();

		grp.add_vertex("A");
		grp.add_vertex("B");
		grp.add_vertex("C");
		grp.add_vertex("D");
		grp.add_vertex("E");
		grp.add_vertex("F");
		grp.add_vertex("G");

		grp.addEdge("A", "B", 2);
		grp.addEdge("A", "D", 12);
		grp.addEdge("B", "C", 22);
		grp.addEdge("C", "D", 28);
		grp.addEdge("D", "E", 62);
		grp.addEdge("E", "F", 42);
		grp.addEdge("E", "G", 23);
		grp.addEdge("F", "G", 29);

//		grp.display();

//		System.out.println(grp.number_of_edges());
//		System.out.println(grp.number_of_vertex());
//		System.out.println(grp.containsEdge("A","C"));
//		System.out.println(grp.containsEdge("B","C"));
//		
//		grp.removeEdge("D", "E");
//		grp.display();
//		
//		grp.removeVertex("F");
//		
//		grp.display();
//		
//		grp.add_vertex("F");
//		grp.display();
//		grp.addEdge("A", "F", 10);
//		grp.display();
//		

//		System.out.println(grp.hasPath("A", "G", new HashMap<>()));
//		grp.removeEdge("D", "E");
//		System.out.println(grp.hasPath("A", "G", new HashMap<>()));

//		System.out.println(grp.BFS("A", "F"));
//		grp.removeEdge("A", "D");
//		System.out.println(grp.BFS("A", "F"));
//		grp.removeEdge("D", "E");
//		System.out.println(grp.BFS("A", "F"));

//		System.out.println(grp.DFS("A", "F"));
//		grp.removeEdge("A", "D");
//		System.out.println(grp.DFS("A", "F"));
//		grp.removeEdge("D", "E");
//		System.out.println(grp.DFS("A", "F"));
//		
//		grp.add_vertex("A");
//		grp.add_vertex("H");
//		grp.add_vertex("C");
//		grp.add_vertex("D");
//		grp.add_vertex("E");
//		grp.add_vertex("F");
//		grp.add_vertex("G");
//
//		grp.addEdge("A", "H", 2);
//		grp.addEdge("A", "D", 12);
//		grp.addEdge("H", "C", 22);
//		grp.addEdge("C", "D", 28);
//		grp.addEdge("D", "E", 62);
//		grp.addEdge("E", "F", 42);
//		grp.addEdge("E", "G", 23);
//		grp.addEdge("F", "G", 29);
//
//		System.out.println(grp.DFS("A", "F"));
//		grp.removeEdge("D", "E");
//		System.out.println(grp.DFS("A", "F"));
		
		// ider na binary tree ki tarah chegleya chota fir bda  krke
//		and processing sabse bde ki hogyi
//		
//		jaise upper B tha toh different answer 
//		 aab B ko H banke kiya toh different answer aayegya
		
		
		
		
		
//		grp.BFT();
//		System.out.println("------------------");
//		grp.removeEdge("D", "E");
//		grp.BFT();
		
		grp.DFT();
		
	}

}
