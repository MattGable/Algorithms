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
		//Initialize the number of buckets based on input
		tableSize = inputTableSize;
		
		//Initialize the size of the array (based on the number of buckets)
		tableArray = new String [tableSize];
	}
	
	/**
	 * Hashes a the new member's key and adds it to the hash table. 
	 * @param inputKey the key to be added to the hash table.
	 */
	public void addMember (String inputKey)
	{
		tableArray[simpleHash(inputKey)] = inputKey;
	}
	
	/**
	 * Computes a sample hash and returns the sample value for a given string.
	 * @param inputKey the key to be hashed.
	 * @return the hash table index of the input key string.
	 */
	public int getSampleIndex (String inputKey)
	{
		int index = simpleHash(inputKey);
		
		System.out.println("The index for the key of " + inputKey + " is " + index);
		
		return index;
	}
	
	/**
	 * A simple hash that gets an index based on the integer value of the 
	 * first character of the key string.
	 * @param inputKey the string value to be stored in the hash table (in lower case).
	 * @return the hash value.
	 */
	public int simpleHash (String inputKey)
	{
		int hash = Character.getNumericValue(inputKey.charAt(0)) - Character.getNumericValue('a');
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
			System.out.println(	"|The key stored at index " + i + " is: " + tableArray[i] + "|");
		}
	}
}
