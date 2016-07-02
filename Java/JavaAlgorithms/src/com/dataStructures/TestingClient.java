package com.dataStructures;

/**
 * the main client for the dataStructures package classes. This contains some
 * code for testing the various dataStructures classes. 
 * @author Matt
 */
public class TestingClient 
{
	public static void main (String[] args)
	{
		//===TESTING LINKEDLIST
		LinkedList<Integer> newList = new LinkedList();
		
		//Add new nodes with integer literals (autoboxed)
		newList.addNode(45);
		newList.addNode(55);
		
		//Add a new node as an Integer object
		newList.addNode(new Integer(99));
		
		newList.printList();
		
		//===TESTING HASHTABLE
		HashTable newHashTable = new HashTable(3);
		
		newHashTable.addMember("aarkvark");
		newHashTable.addMember("bee");
		newHashTable.addMember("crow");
		newHashTable.printTable();
		
	}

}
