package com.dataStructures;

public class BSTNode <T>
{
	private T value;
	
	private BSTNode<T> leftNode;
	private BSTNode<T> rightNode;
	
	public void setValue (T inputValue)
	{
		value = inputValue;
	}
	
	public T getValue ()
	{
		return value;
	}

}
