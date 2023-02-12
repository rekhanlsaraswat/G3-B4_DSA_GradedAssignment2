package com.gl.main;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of nodes:");
		int num = scan.nextInt();
		BinarySearchTree bst = new BinarySearchTree();
		System.out.println("Enter the elements:");
		for (int i = 0; i < num; i++)
			bst.insertData(scan.nextInt());
		System.out.println("Data according to Old Transaction Management System:");
		bst.displayBST();
		System.out.println("\nConverting Complete Binary Search Tree to Right Skewed Binary Tree...");
		bst.setRoot(SkewedTreeImpl.convertTree(bst.getRoot()));
		System.out.println("Data according to New Transaction Management System:");
		bst.displayBST();
		scan.close();
	}
}
