package trees;

import java.util.*;

public class BST {
	Node root;

	BST() {
		root = null;
	}

	BST(int value) {
		root = new Node(value);
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		} else if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);
		return root;
	}

	void printInorder(Node node) {
		if (node == null)
			return;
		printInorder(node.left);
		System.out.print(node.key + " ");
		printInorder(node.right);
	}

	void printInorder() {
		printInorder(root);
	}

	void printInorderVariation(Node node) {
		if (node == null)
			return;
		printInorderVariation(node.right);
		System.out.print(node.key + " ");
		printInorderVariation(node.left);
	}

	void printInorderVariation() {
		printInorderVariation(root);
	}

	void printPreorder(Node node) {
		if (node == null)
			return;
		System.out.print(node.key + " ");
		printPreorder(node.left);
		printPreorder(node.right);
	}

	void printPreorder() {
		printPreorder(root);
	}

	void printPostorder(Node node) {
		if (node == null)
			return;
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.print(node.key + " ");
	}

	void printPostorder() {
		printPostorder(root);
	}

	void deleteKey(int key) {
		root = deleteRec(root, key);
	}

	Node deleteRec(Node root, int key) {
		if (root == null)
			return root;
		if (key < root.key)
			root.left = deleteRec(root.left, key);
		else if (key > root.key)
			root.right = deleteRec(root.right, key);
		else {
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;
			// node with two children: Get the inorder successor (smallest in the right
			// subtree)
			root.key = minValue(root.right);
			// Delete the inorder successor
			root.right = deleteRec(root.right, root.key);
		}
		return root;
	}

	int minValue(Node root) {
		int minv = root.key;
		while (root.left != null) {
			minv = root.left.key;
			root = root.left;
		}
		return minv;
	}

	void printLevelOrder() {
		int h = height(root);
		int i;
		for (i = 1; i <= h; i++)
			printCurrentLevel(root, i);
		System.out.println();
	}

	int height(Node root) {
		if (root == null)
			return 0;
		else {
			int lheight = height(root.left);
			int rheight = height(root.right);

			if (lheight > rheight)
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}

	void printCurrentLevel(Node root, int level) {
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.key + " ");
		else if (level > 1) {
			printCurrentLevel(root.left, level - 1);
			printCurrentLevel(root.right, level - 1);
		}
	}

	void levelOrderTraversalUsingQueue() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node temp = queue.poll();
			System.out.print(temp.key + " ");
			if (temp.left != null)
				queue.add(temp.left);
			if (temp.left != null)
				queue.add(temp.right);
		}
	}

}
