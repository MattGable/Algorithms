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
		
		newHashTable.getSampleIndex("dreadfort");
		
		newHashTable.printTable();
		
		//===TESTING BINARY SEARCH TREE
		BinarySearchTree newBinarySearchTree = new BinarySearchTree();
		
		BinarySearchTree emptyTree = new BinarySearchTree();
		
		newBinarySearchTree.insertNode(newBinarySearchTree.getRoot(), 4);
		newBinarySearchTree.insertNode(newBinarySearchTree.getRoot(), 1);
		newBinarySearchTree.insertNode(newBinarySearchTree.getRoot(), 3);
		newBinarySearchTree.insertNode(newBinarySearchTree.getRoot(), 6);
		
		newBinarySearchTree.printTreeRoot();
		
		System.out.println("Root's left: " + newBinarySearchTree.getRoot().getLeftValue());
		System.out.println("Root's right: " + newBinarySearchTree.getRoot().getRightValue());

		
		System.out.println("EMpty tree size is: " + emptyTree.size());
		System.out.println("Large tree size is: " + newBinarySearchTree.size());
		
	}

}
