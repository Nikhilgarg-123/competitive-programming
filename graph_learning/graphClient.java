package graph_learning;

public class graphClient {

	public static void main(String[] args) {
		graphs grp=new graphs();
		
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
		
		grp.display();
		
		System.out.println(grp.number_of_edges());
		System.out.println(grp.number_of_vertex());
		System.out.println(grp.containsEdge("A","C"));
		System.out.println(grp.containsEdge("B","C"));
		
		grp.removeEdge("A", "B");
		grp.display();
		
		grp.removeVertex("F");
		
		grp.display();
		
		

	}

}
