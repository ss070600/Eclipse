package trees;

public class BST_BFS_Queue {

	public static void main(String[] args) {
		BST tree = new BST();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Level order traversal of binary tree using queue is ");
		tree.levelOrderTraversalUsingQueue();

	}

}
