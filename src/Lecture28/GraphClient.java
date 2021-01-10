package Lecture28;

public class GraphClient {

	public static void main(String[] args) {

		Graph graph = new Graph();

		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");

		graph.addEdge("A", "B", 10);
		graph.addEdge("A", "D", 20);
		graph.addEdge("B", "C", 30);
		graph.addEdge("C", "D", 40);
		graph.addEdge("D", "E", 50);
		graph.addEdge("E", "F", 60);
		graph.addEdge("F", "G", 70);

		graph.display();

		System.out.println(graph.bfs("A", "F"));
		System.out.println(graph.dfs("A", "F"));
		graph.bft();
		graph.dft();

		System.out.println(graph.isConnected());
		System.out.println(graph.isTree());
		System.out.println(graph.isCyclic());
		
		System.out.println(graph.getcc());
		
		System.out.println(graph.isBipartite());
	}

}
