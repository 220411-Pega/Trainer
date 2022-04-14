package com.revature.app;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExamples {

	static Queue<String> stringQueue;
	
	public static void show() {
		
		stringQueue = new ArrayDeque<String>();
		
		// To add to a queue...
		stringQueue.offer("I am the first!");
		stringQueue.offer("I am the second!");
		
		// To look at the front of the queue, ie the next element
		System.out.println("The next item is: " + stringQueue.peek());
		
		// To pull the next item, remove it from the queue, and return it
		String next = stringQueue.poll(); // Think of poll as moving the queue forward
		System.out.println("Removed: " + next);
		System.out.println("The next item is: " + stringQueue.peek());
	}
}
