package com.dataStructures;

public class Node<T>
{
	//Singly-linked node
	private T value;
	private Node<T> nextRef;
	
	public Node (T inputValue)
	{
		value = inputValue;
	}
	
	public T getValue()
	{
		return value;
	}
	
	public void setNextRef (Node <T> ref)
	{
		nextRef = ref;
	}
}
