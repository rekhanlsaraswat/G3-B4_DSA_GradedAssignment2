package com.gl.main;

public class SkewedTreeImpl {
	private static Node prev = null;
	private static Node head = null;

	public static Node convertTree(Node root) {
		if (root == null) {
			return root;
		}
		convertTree(root.getLeft());
		Node rightNode = root.getRight();
		if (head == null) {
			head = root;
			root.setLeft(null);
			prev = root;
		} else {
			prev.setRight(root);
			root.setLeft(null);
			prev = root;
		}
		convertTree(rightNode);
		return head;
	}
}