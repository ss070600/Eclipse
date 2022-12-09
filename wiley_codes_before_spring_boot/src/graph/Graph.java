package graph;

import java.util.*;

public class Graph {
	private int V;
	private LinkedList<Integer> adjacencyList[];

	Graph(int v) {
		this.V = v;
		adjacencyList = new LinkedList[v + 1];
		for (int i = 1; i < v + 1; ++i)
			adjacencyList[i] = new LinkedList();
	}

	void addEdge(int a, int b) {
		adjacencyList[a].add(b);
	}
	void removeEdge(int a,int b) {
		adjacencyList[a].poll();
	}

	void BFS(int sourceNode) {
		// Note that the above code traverses only the vertices reachable from a given
		// source vertex. In every situation, all the vertices may not be reachable from
		// a given vertex (i.e. for a disconnected graph).
		// Time Complexity: O(V+E), where V is the number of nodes and E is the number
		// of edges.
		// Auxiliary Space: O(V)

		boolean[] visited = new boolean[this.V + 1];
		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(sourceNode);
		visited[sourceNode] = true;

		while (!queue.isEmpty()) {
			sourceNode = queue.poll();
			System.out.print(sourceNode + " ");

			Iterator itr = adjacencyList[sourceNode].iterator();
			while (itr.hasNext()) {
				int i = (int) itr.next();
				if (!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}

	}

	void BFS_complete(int sourceNode) {
		boolean[] visited = new boolean[this.V + 1];
		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(sourceNode);
		visited[sourceNode] = true;

		// this part is same as function BFS(int sourceNode) firstly we can use this part to traverse
		// all the nodes reachable from sourceNode and then we can use below 2nd part (below part)to
		// traverse remaining nodes in case of disconnected graph.
		while (!queue.isEmpty()) {
			sourceNode = queue.poll();
			System.out.print(sourceNode + " ");

			Iterator<Integer> itr = adjacencyList[sourceNode].iterator();
			while (itr.hasNext()) {
				int t = (int) itr.next();
				if (visited[t] == false) {
					visited[t] = true;
					queue.add(t);
				}
			}
		}

		//2nd part 
		for (int i = 1; i < this.V + 1; i++) {
			if(visited[i]== false) {
				sourceNode=i;
				queue.add(sourceNode);
				visited[sourceNode] = true;
				
				while (!queue.isEmpty()) {
					sourceNode = queue.poll();
					System.out.print(sourceNode + " ");

					Iterator<Integer> itr = adjacencyList[sourceNode].iterator();
					while (itr.hasNext()) {
						int t = (int) itr.next();
						if (visited[t] == false) {
							visited[t] = true;
							queue.add(t);
						}
					}
				}
				
			}
		}
	}
	
	

	public static void main(String[] args) {
		Graph g = new Graph(7);

		//1st connected part
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		g.addEdge(3, 1);
		g.addEdge(3, 4);
		g.addEdge(4, 4);
		
		//2nd connected part disconnected from 1st part
		g.addEdge(5, 6);
		g.addEdge(7, 6);

		System.out.println("Following is Breadth First Traversal (starting from vertex 2)");

		System.out.print("g.BFS(3) [not suitable for disconnected graphs] : ");
		g.BFS(3);
		System.out.println();
		System.out.print("g.BFS_complete(3) [suitable for disconnected graphs] : ");
		g.BFS_complete(3);
		System.out.println();
		g.removeEdge(7, 6);
		System.out.println("after g.removeEdge(7, 6) : ");
		g.BFS_complete(3);
		

	}

}
