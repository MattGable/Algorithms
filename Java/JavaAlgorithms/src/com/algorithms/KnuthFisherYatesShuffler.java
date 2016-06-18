package com.algorithms;

import java.util.Arrays;
import java.util.Random;

/**
 * an implementation of the Knuth/Fisher-Yates shuffle.
 * @author Matt
 */
public class KnuthFisherYatesShuffler 
{
	
	/**
	 * performs the Knuth/Fisher-Yates shuffle on an array of integers (O(n)).
	 * @param inputArray the array of integers to be shuffled.
	 */
	public void intShuffler (int [] inputArray)
	{
		System.out.println("The inputArray before shuffling is: " + Arrays.toString(inputArray));
		
		//Initialize a new instance of Random
		Random rand = new Random();
		
		int n = inputArray.length;
		
		for (int i = 0; i < inputArray.length; i++)
		{
			//Decrement n so we essentially pull from the range of indexes with less (probabilistic) replacement 
			swap(inputArray, i, rand.nextInt(n--));
		}
		
		System.out.println("The inputArray after shuffling is: " + Arrays.toString(inputArray));
	}
	
	/**
	 * performs an in-place swap of two elements in an array of integers.
	 * @param inputArray the array that contains the elements to be swapped.
	 * @param indexA the index of the first element to be swapped.
	 * @param indexB the index of the second element to be swapped.
	 */
	private void swap (int [] inputArray, int indexA, int indexB)
	{
		int temp = inputArray[indexA];
		inputArray[indexA] = inputArray[indexB];
		inputArray[indexB] = temp;
	}
}
