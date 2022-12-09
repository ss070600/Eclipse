package trees;

public class BST_Test {

	public static void main(String[] args) {

		BST tree = new BST();
		tree.root = new Node(4);
		tree.root.left = new Node(2);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);
		System.out.println("Inorder traversal of binary tree is ");
		tree.printInorder();
		System.out.println("\nInorder Variation traversal of binary tree is ");
		tree.printInorderVariation();
		System.out.println("\nPreorder traversal of binary tree is ");
		tree.printPreorder();
		System.out.println("\nPostorder traversal of binary tree is ");
		tree.printPostorder();
	}

}
