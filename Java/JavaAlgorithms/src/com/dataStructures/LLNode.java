package com.dataStructures;

/**
 * the generic-type node object for a linked list.
 * @author Matt
 *
 * @param <T> the type of object that is held by this node.
 */
public class LLNode<T>
{
	//Singly-linked node
	private T value;
	private LLNode<T> nextRef;
	
	
	/**
	 * @param inputValue sets the current node's value.
	 */
	public void setValue (T inputValue)
	{
		value = inputValue;
	}
	
	/**
	 * @return the value field of the node.
	 */
	public T getValue ()
	{
		return value;
	}
	
	/**
	 * @param ref the node to set as the next node in the linked lists's sequence.
	 */
	public void setNextRef (LLNode <T> ref)
	{
		nextRef = ref;
	}
	
	/**
	 * @return the reference to the next node.
	 */
	public LLNode<T> getNextRef ()
	{
		return nextRef;
	}
}
