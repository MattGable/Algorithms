package com.dataStructures;

/**
 * an object that holds a list of singly-linked nodes.
 * @author Matt
 *
 * @param <T> the type of object that this linked list will hold in its nodes
 */
public class LinkedList<T>
{
	private LLNode<T> head;
	private LLNode<T> tail;
	
	/**
	 * adds a new node to the linked list.
	 * @param newNode the value of the new node to be added to the linked list.
	 */
	public void addNode (T newNode)
	{
		LLNode<T> temp = new LLNode<T>();
		temp.setValue(newNode);
		
		if (head == null)
		{
			head = temp;
			tail = temp;
		}
		else
		{
			tail.setNextRef(temp);
			tail = temp;
		}
	}
	
	/**
	 * prints the values of each node in the linked list.
	 */
	public void printList ()
	{
		LLNode<T> current = head;
		
		while (current != null)
		{
			System.out.println("Current node's value: " + current.getValue());
			current = current.getNextRef();
		}
		if (current == null)
		{
			System.out.println("List has no more elements.");
		}
	}
}
