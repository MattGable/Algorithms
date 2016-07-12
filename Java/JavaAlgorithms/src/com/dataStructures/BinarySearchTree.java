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
	private BstNode root;
	
	public BstNode getRoot ()
	{
		return root;
	}
	
	//TODO: Finish implementation
	public void insertNode (BstNode inputNode, int inputValue)
	{
		/**
		//Base case if root is null
		if (root == null)
		{
			root = new BstNode();
			root.setValue(inputValue);
			return;
		}
		**/
		//Base case if a node object reference is null
		if (inputNode == null)
		{
			inputNode = new BstNode();
			inputNode.setValue(inputValue);
			System.out.println("inputNode is: " + inputNode.getValue());
			return;
		}
		
		//Check inputValue against current value of node
		if (inputValue <= inputNode.getValue())
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
	 * A function to print the root node's value
	 */
	public void printTreeRoot ()
	{
		if (root != null)
		{
			System.out.println(root.getValue());
		}

		else //if (root == null)
		{
			System.out.println("Root is null");
		}
		
	}
	
	//TODO: Finish implementation here!!
	public int size ()
	{
		return size(root);
	}
	//TODO: Fix implementation!
	//TODO: maybe add another base case, that is the root with two 
	// subnodes
	private int size (BstNode inputNode)
	{
		if (inputNode == null)
		{
			System.out.println("Node is null");
			return 0;
		}
		
		else if (inputNode.getLeftNode() != null && inputNode.getRightNode() == null)
		{
			System.out.println("here??");
			return size(inputNode.getLeftNode()) + 1;
		}
		
		else if(inputNode.getRightNode() != null && inputNode.getLeftNode() == null)
		{
			System.out.println("here2??");
			return size(inputNode.getRightNode()) + 1;
		}
		//TODO: change to getNode...null references
		else //if (inputNode.getLeftNode() != null && inputNode.getRightNode() !=  null)
		{
			return size(inputNode.getLeftNode()) + 2 + size(inputNode.getRightNode());
		}
	}
	
	
	//TODO: complete this implementation
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
