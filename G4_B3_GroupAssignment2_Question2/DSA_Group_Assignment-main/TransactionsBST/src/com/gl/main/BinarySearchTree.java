package com.gl.main;

public class BinarySearchTree {
	private Node root;

	public BinarySearchTree() {
		root = null;
	}
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	
	public void insertData(Integer data) {
		root = insert(root, data);
	}
	public Node insert(Node root, Integer data) {
		if (root == null)
			root = new Node(data);
		else if (data < root.getData())
			root.setLeft(insert(root.getLeft(), data));
		else if (data > root.getData())
			root.setRight(insert(root.getRight(), data));
		return root;
	}

	public void displayBST() {
		display(root);
	}
	public void display(Node root) {
		if (root != null) {
			display(root.getLeft());
			System.out.print(root.getData() + " ");
			display(root.getRight());
		}
	}
}
