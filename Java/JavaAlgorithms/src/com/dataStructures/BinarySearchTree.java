package com.dataStructures;

public class BinarySearchTree <T>
{
	
	BSTNode<T> root = new BSTNode();
	
	public void addBSTNode(T newValue)
	{
		if (root.getValue() == null)
		{
			root.setValue(newValue);
		}
	}
	
	public void printTreeRoot ()
	{
		System.out.println(root.getValue());
	}
	
}
