package com.dataStructures;

public class BstNode
{
	private int value = 0;
	
	private BstNode leftNode;
	private BstNode rightNode;
	
	public void setValue (int inputValue)
	{
		value = inputValue;
	}
	
	public int getValue ()
	{
		return value;
	}
	
	public int getLeftValue ()
	{
		return leftNode.getValue();
	}
	
	public int getRightValue ()
	{
		return rightNode.getValue();
	}
	
	public void initializeLeftNode()
	{
		leftNode = new BstNode();
	}
	
	public void initializeRightNode()
	{
		rightNode = new BstNode();
	}
	
	public BstNode getLeftNode ()
	{
		return leftNode;
	}
	
	public BstNode getRightNode ()
	{
		return rightNode;
	}

}
