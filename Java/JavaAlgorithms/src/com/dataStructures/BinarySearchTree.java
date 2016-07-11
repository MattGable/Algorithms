package com.dataStructures;

/**
 * BinarySearchTree is a data structure class that holds nodes 
 * in a binary tree--each node has at most two
 * children. The left child node is always less than or equal to
 * the parent, and the right node is always greater than
 * the parent. This implementation uses zero as a "blank" value field.
 * 
 * BinarySearchTree and BSTNode are written in response to the 
 * learning problems posed by Nick Parlante here:
 * http://cslibrary.stanford.edu/110/BinaryTrees.html
 * 
 * @author Matt
 */
public class BinarySearchTree
{
	//TODO: public for testing
	public BstNode root;
	
	public BstNode getRoot ()
	{
		return root;
	}
	
	//TODO: Finish implementation
	public void insertNode (BstNode inputNode, int inputValue)
	{
		if (root == null)
		{
			root = new BstNode();
			root.setValue(inputValue);
		}
		//Base case if a node object reference is null
		if (inputNode == null)
		{
			inputNode = new BstNode();
			inputNode.setValue(inputValue);
			System.out.println("inputNode is: " + inputNode.getValue());
			return;
		}
		
		/**
		//Base case if the inputNode's value is zero (blank),
		//then place the value at that node and return
		if (inputNode.getValue() == 0)
		{
			inputNode.setValue(inputValue);
			return;
		}
		**/
		else if (inputValue <= inputNode.getValue())
		{
			insertNode (inputNode.getLeftNode(), inputValue);
		}
		
		else if (inputValue > inputNode.getValue())
		{
			insertNode (inputNode.getRightNode(), inputValue);
		}
		
		System.out.println("HII");
	}
	
	/**
	 * TODO: Probably get rid of this function 
	 * a simple function to print the root node of the tree
	 */
	public void printTreeRoot ()
	{
		if (root != null)
		{
			System.out.println(root.getValue());
		}
		//TODO: clean this up
		else if (root == null)
		{
			System.out.println("Root is null");
		}
		
	}
	
	public boolean lookup (int lookupValue)
	{
		BstNode currentNode = root;
		
		if (currentNode == null)
		{
			return false;
		}
		//TODO: Complete implementation; check for null left and right nodes
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
