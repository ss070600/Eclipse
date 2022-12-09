package graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Graph_ {
	private class Node {
		private String label;

		public Node(String label) {
			this.label = label;
		}

		@Override
		public String toString() {
			return label;
		}
	}

	Map<String, Node> nodes = new HashMap<>();
	Map<Node, List<Node>> adjacencyList = new HashMap<>();

	public void addNode(String label) {
		var node = new Node(label);
		nodes.putIfAbsent(label, node);
		adjacencyList.putIfAbsent(node, new ArrayList<>());
	}

	public void removeNode(String label) {
		if (nodes.containsKey(label))
			nodes.remove(label);
	}

	// Remove node from Graph
	public void removeNodes(String label) {
		if (!nodes.keySet().contains(label))
			throw new IllegalStateException();

		Node removedNode = nodes.get(label);
		nodes.remove(label);
		Collection<Node> keys = adjacencyList.keySet();
		// For removing list associated with that node
		adjacencyList.remove(removedNode);

		// for removing all the edges from other node to the node that is to be removed.
		for (Node key : keys) {
			if (adjacencyList.get(key).contains(removedNode))
				adjacencyList.get(key).remove(removedNode);
		}

		System.out.println(label + " removed successfully");
	}

	public void removeEdge(String from, String to) {

		Node nodeFrom = nodes.get(from);

		Node nodeTo = nodes.get(from);

		if (nodeFrom != null && nodeTo != null)
			this.adjacencyList.get(nodeFrom).remove(nodeTo);

	}

	// Remove edge from graph
	public void removeEdges(String from, String to) {
		if (!nodes.keySet().contains(to))
			throw new IllegalStateException();
		if (!nodes.keySet().contains(from))
			throw new IllegalStateException();

		Node fromNode = nodes.get(from);
		Node toNode = nodes.get(to);

		if (adjacencyList.get(fromNode).contains(toNode)) {
			adjacencyList.get(fromNode).remove(toNode);
			System.out.println("Edge from " + from + " to " + to + " removed successfully.");
		} else {
			System.out.println("There is no edge from " + from + " to " + to + ".");
		}

	}

	public void addEdge(String from, String to) {
		var fromNode = nodes.get(from);
		if (fromNode == null)
			throw new IllegalArgumentException();
		var toNode = nodes.get(to);
		if (toNode == null)
			throw new IllegalArgumentException();
		adjacencyList.get(fromNode).add(toNode);
	}

	public void print() {
		for (var source : adjacencyList.keySet()) {
			var targets = adjacencyList.get(source);
			if (!targets.isEmpty())
				System.out.println(source + " is connected to " + targets);
		}
	}
}

public class GraphExampleOfClass {

	public static void main(String[] args) {
		Graph_ graph = new Graph_();
		graph.addNode("A");
		graph.addNode("B");
		graph.addNode("C");
		graph.addEdge("A", "B");
		graph.addEdge("A", "C");

		graph.addNode("D");
		graph.addNode("E");
		graph.addNode("F");
		graph.addEdge("D", "E");
		graph.addEdge("D", "F");

		graph.addEdge("D", "A");

		graph.print();

		graph.removeEdge("D", "E");
		graph.print();

	}

}