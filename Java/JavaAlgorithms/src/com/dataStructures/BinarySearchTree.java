package com.dataStructures;

/**
 * BinarySearchTree is a data structure class that holds nodes 
 * in a binary tree--each node has at most two
 * children. The left child node is always less than or equal to
 * the parent, and the right node is always greater than
 * the parent.
 * 
 * BinarySearchTree and BSTNode are written in response to the 
 * learning problems posed by Nick Parlante here:
 * http://cslibrary.stanford.edu/110/BinaryTrees.html
 * 
 * @author Matt
 *
 * @param <T> the generic type of the node the tree holds
 */
public class BinarySearchTree
{
	
	BstNode root;
	
	/**
	 * TODO: probably get rid of this class 
	 * adds a new node to the binary search tree
	 * @param newValue the value field of the new node
	 */
	public void addBSTNode(int newValue)
	{
		if (root == null)
		{
			root = new BstNode();
			root.setValue(newValue);
		}
	}
	
	
	public void printTreeRoot ()
	{
		System.out.println(root.getValue());
	}
	
	public boolean lookup (int lookupValue)
	{
		BstNode currentNode = root;
		
		if (currentNode == null)
		{
			return false;
		}
		//TODO: check for null left and righ tnodes!!
		if (currentNode.getLeftNode() !=  null && lookupValue >= currentNode.getLeftValue())
		{
			System.out.println("hello");
		}
		else if (currentNode.getRightNode() != null && lookupValue < currentNode.getRightValue())
		{
			System.out.println("Value found.");
			return true;
		}
		else if (currentNode.getValue() == lookupValue)
		{
			System.out.println("Value found!");
		}
		
		System.out.println("Value not found.");
		return false;
	}
	
}
