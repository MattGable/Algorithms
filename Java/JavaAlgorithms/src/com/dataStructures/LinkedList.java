package com.dataStructures;

public class LinkedList<T>
{
	private Node<T> head;
	private Node<T> tail;
	
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
	
	public void printList ()
	{
		Node<T> current = head;
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
