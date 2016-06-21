package com.dataStructures;

/**
 * an object that holds a list of singly-linked nodes.
 * @author Matt
 *
 * @param <T> the type of object that this linked list will hold in its nodes
 */
public class LinkedList<T>
{
	private Node<T> head;
	private Node<T> tail;
	
	/**
	 * adds a new node to the linked list.
	 * @param newNode the value of the new node to be added to the linked list.
	 */
	public void addNode (T newNode)
	{
		Node<T> temp = new Node<T>();
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
		Node<T> current = head;
		
		while (current != null)
		{
			if ( current.equals(head))
			{
				System.out.print("HEAD: ");
			}
			if (current.equals(tail))
			{
				System.out.print("TAIL: ");
			}
			System.out.println("Current node's value: " + current.getValue());
			System.out.println("Node's current getNextRef: " + current.getNextRef());
			current = current.getNextRef();
		}
		if (current == null)
		{
			System.out.println("List has no more elements.");
		}
	}
}
