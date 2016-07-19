package com.dataStructures;

/**
 * This class represents a node for use in a binary search tree. For testing purposes, many of the 
 * methods are public.
 * @author Matt
 */
public class BstNode
{
	/**
	 * Nodes' values are always initialized to zero.
	 */
	private int value = 0;
	
	/**
	 * Left and right nodes are not automatically initialized--to save space.
	 */
	private BstNode leftNode;
	private BstNode rightNode;
	
	/**
	 * Allows the value of the node to be set to any integer value.
	 * @param inputValue The value to assign to the node.
	 */
	protected void setValue (int inputValue)
	{
		value = inputValue;
	}
	
	/**
	 * Allows the value of the node to be retrieved.
	 * @return The value currently held in the node.
	 */
	public int getValue ()
	{
		return value;
	}
	
	/**
	 * Allows the value of the node's left child to be retrieved.
	 * @return The value currently held in the node's left child.
	 */
	public int getLeftValue ()
	{
		return leftNode.getValue();
	}
	
	/**
	 * Allows the value of the node's right child to be retrieved.
	 * @return The value currently held in the node's right child.
	 */
	public int getRightValue ()
	{
		return rightNode.getValue();
	}
	
	/**
	 * Initializes the left node reference in the node.
	 */
	protected void initializeLeftNode()
	{
		leftNode = new BstNode();
	}
	
	/**
	 * Initializes the right node reference in the node.
	 */
	protected void initializeRightNode()
	{
		rightNode = new BstNode();
	}
	
	/**
	 * Allows the the node's left child reference to be retrieved.
	 * @return A reference to the node's left child.
	 */
	public BstNode getLeftNode ()
	{
		return leftNode;
	}
	
	/**
	 * Allows the the node's right child reference to be retrieved.
	 * @return A reference to the node's right child.
	 */
	public BstNode getRightNode ()
	{
		return rightNode;
	}

}
