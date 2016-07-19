package com.dataStructures;

/**
 * BinarySearchTree is a data structure class that holds nodes 
 * in a binary tree--each node has at most two
 * children. The left child node is always less than or equal to
 * the parent, and the right node is always greater than
 * the parent. 
 * 
 * This implementation uses zero as a "blank" node. It also handles duplicates.
 * 
 * Currently, this is kept as simple as possible (no input validation, etc.).
 * 
 * BinarySearchTree and BSTNode are written in response to the 
 * learning problems posed by Nick Parlante here:
 * http://cslibrary.stanford.edu/110/BinaryTrees.html
 * 
 * @author Matt
 */
public class BinarySearchTree
{
	/**
	 * The root node is declared and initialized.
	 */
	private BstNode root = new BstNode();
	
	
	/**
	 * Returns the root BstNode object for the binary search tree.
	 * @return The root node.
	 */
	public BstNode getRoot ()
	{
		return root;
	}
	

	/**
	 * Inserts a node recursively into the binary search tree. When using this method
	 * explicitly, pass the node from which to start the insertion from (usually the root). 
	 * @param inputNode The node examined. If zero, then the value is placed there.
	 * @param inputValue The value to be placed into the binary search tree.
	 */
	public void insertNode (BstNode inputNode, int inputValue)
	{

		//Base case: If a node object is zero, then place the new node addition here.
		if (inputNode.getValue() == 0)
		{
			inputNode.setValue(inputValue);
			System.out.println("Placed the value of: " + inputNode.getValue());
			return;
		}
		
		//If the inserted value is less than or equal to the current node.
		if (inputValue <= inputNode.getValue())
		{
			//If the left node is null, initialize it.
			if (inputNode.getLeftNode() == null)
			{
				inputNode.initializeLeftNode();
			}
			
			System.out.println("Moving down the tree to the left (<)...");
			//Recursively check the next node's value.
			insertNode (inputNode.getLeftNode(), inputValue);
		}
		//If the inserted value is more than the current node.
		else if (inputValue > inputNode.getValue())
		{
			//If the right node is null, initialize it.
			if (inputNode.getRightNode() == null)
			{
				inputNode.initializeRightNode();
			}
			
			System.out.println("Moving down the tree to the right (>)...");
			//Recursively check the next node's value.
			insertNode (inputNode.getRightNode(), inputValue);	
		}
	}
	
	/**
	 * Prints the root node's integer value to the console. 
	 */
	public void printTreeRoot ()
	{
		if (root.getValue() != 0)
		{
			System.out.println("Root's value is: " + root.getValue());
		}

		else //if (root.getValue() == 0)
		{
			System.out.println("Root is zero");
		}
	}
	
	/**
	 * The access call to a recursive size function.
	 * @return the size(BstNode inputNode) method.
	 */
	public int size ()
	{
		return size(root);
	}

	/**
	 * The recursive size method.
	 * @param inputNode The node to be examined and counted.
	 * @return The numeric result of the recursive call to the function.
	 */
	private int size (BstNode inputNode)
	{
		if (inputNode.getValue() == 0)
		{
			System.out.println("Empty tree.");
			return 0;
		}
		else if (inputNode.getLeftNode() != null && inputNode.getLeftNode().getValue() != 0 && 
				 inputNode.getRightNode() != null && inputNode.getRightNode().getValue() != 0)
		{
			System.out.println("'" + inputNode.getValue() + "' has 2 nonzero children.");
			return size(inputNode.getLeftNode()) + 1 + size(inputNode.getRightNode());
		}
		else if (inputNode.getLeftNode() != null && inputNode.getLeftNode().getValue() != 0 && inputNode.getRightNode() == null)
		{
			System.out.println("'" + inputNode.getValue() + "' has 1 nonzero child to the left (<)");
			return size(inputNode.getLeftNode()) + 1;
		}
		
		else if(inputNode.getRightNode() != null && inputNode.getRightNode().getValue() != 0 && inputNode.getLeftNode() == null)
		{
			System.out.println("'" + inputNode.getValue() + "' has 1 nonzero child to the right (>)");
			return size(inputNode.getRightNode()) + 1;
		}
		else if (inputNode.getLeftNode() == null && inputNode.getRightNode() == null)
		{
			System.out.println("'" + inputNode.getValue() + "' has no children.");
			return 1;
		}
		else 
		{
			System.out.println("Other condition--inputNode.getValue(): " + inputNode.getValue());
			return 0;
		}
	}
	
	
	//TODO: complete this implementation
	/**
	 * @param lookupValue
	 * @return
	 */
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
