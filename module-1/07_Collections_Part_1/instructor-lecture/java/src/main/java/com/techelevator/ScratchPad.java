package com.techelevator;

//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//import java.util.Stack;

import java.util.*;


public class ScratchPad {

	public static void main(String[] args) {
	
		
		//Declare and instantiate a new ArrayList
		List<String> hobbits = new ArrayList<String>();
		
		hobbits.add("Bilbo");
		hobbits.add("Frodo");
		hobbits.add("Matty");
		hobbits.add("Brian");
		
		
		String matty = hobbits.get(2);
//		hobbits.add(2, "Bob");
//		hobbits.remove(3);
		
		hobbits.set(2, "Matty The New Guy");
		
		
		
//		hobbits.add(1, "Pippin");
//		hobbits.add(1, "George");
//		
//		
//		
		String removedHobbit = hobbits.remove(1);
//		
		
		for (int i=0; i<hobbits.size(); i++) {
			System.out.println(hobbits.get(i));
		}
		
		
		// only loops forward - looks at every element
		for (String hobbit : hobbits) {
			System.out.println(hobbit);
		}
		
		int foundIndex = hobbits.indexOf("Brian");
		
		System.out.println(hobbits.get(foundIndex));
		
		
		
		
		
		
		
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		int x = 7;
		Integer xAsIntegerObj = new Integer(x);
		
		
		double doubleVal = xAsIntegerObj.doubleValue();

		
		
		
		
		
		List<Boolean> booleans = new ArrayList<Boolean>();
		
		
		
		List<Long> longs = new ArrayList<Long>();
		
		
		
		
		
		Queue<String> myTasks = new LinkedList<String>();
		
		myTasks.offer("Task 1");
		myTasks.offer("Task 2");
		myTasks.offer("Task 3");
		myTasks.offer("Task 4");
		
		
		while (!myTasks.isEmpty()) {
			System.out.println(myTasks.poll());
			
		}
		
		
		
		Stack<String> myStackOfStuff = new Stack<String> ();
		
		myStackOfStuff.push("Stuff 1");
		myStackOfStuff.push("Stuff 2");
		myStackOfStuff.push("Stuff 3");
		myStackOfStuff.push("Stuff 4");
		
		
		while(!myStackOfStuff.isEmpty()) {
			System.out.println(myStackOfStuff.pop());
		}
		
		
		
		
		
		
		

	}

}
