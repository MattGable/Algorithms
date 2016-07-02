package com.dataStructures;

/**
 * This hash table stores input strings as keys and hashes based on those keys. 
 * Time complexity: O(1).
 * Space complexity: O(n).
 * @author Matt
 *
 */
public class HashTable 
{
	String tableArray[];
	int tableSize;
	
	/**
	 * Initializes the hash table based on the number of buckets needed.
	 * @param tableSize the number of buckets needed in the hash table.
	 */
	public HashTable (int inputTableSize)
	{
		//Declare and initialize the size of the array (e.g. number of buckets)
		tableSize = inputTableSize;
		tableArray = new String [tableSize];
	}
	
	/**
	 * Hashes a the new member's key and adds it to the hash table. 
	 * @param key the key to be added to the hash table.
	 */
	public void addMember (String key)
	{
		tableArray[simpleHash(key)] = key;
	}
	
	/**
	 * A simple hash that gets an index based on the integer value of the 
	 * first character of the key string.
	 * @param key the string value to be stored in the hash table (in lower case).
	 * @return the hash value.
	 */
	public int simpleHash (String key)
	{
		int hash = Character.getNumericValue(key.charAt(0)) - Character.getNumericValue('a');
		System.out.println("The result of the hash is: " + hash);
		
		return hash;
	}
	
	/**
	 * Prints each value of the hash table to the console starting with the
	 * first member of the table.
	 */
	public void printTable ()
	{
		for (int i = 0; i < tableArray.length; i++)
		{
			System.out.println(	"The key stored at index " + i + " is: " +
								tableArray[i]);
		}
	}
}
