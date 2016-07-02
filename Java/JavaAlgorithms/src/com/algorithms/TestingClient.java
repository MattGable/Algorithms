package com.algorithms;

/**
 * the client class for testing the JavaAlgorithms package.
 * @author Matt
 */
public class TestingClient 
{
	/**
	 * the client class's main method.
	 * @param args the standard array of Strings in the main method.
	 */
	public static void main (String [] args)
	{
		int [] testArray = new int [] {1, 5, 4, 3};
		
		KnuthFisherYatesShuffler kfyShuffler= new KnuthFisherYatesShuffler();
		
		kfyShuffler.intShuffler(testArray);
	}
}
