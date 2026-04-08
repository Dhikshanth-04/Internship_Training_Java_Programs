/*
 * ArrayDeque
 * Hierarchy : ArrayDeque -> Deque -> Queue -> Collections -> Iterable
 * Initial capacity : 16
 * Internal Data Structure : Re-sizable array
 * New Capacity : currentCapacity * 2
 * Duplicates are allowed, Null values cant be stored : NullPointerException
 * ArrayDeque can store Heterogeneous data
 * Insertion order is maintained
 * 3 Constructors - Zero parameter, Initial capacity, Extends Collections
 * 
 * ArrayDeque Vs LinkedList
 * ArrayDeque has less memory overhead, linkedList has more memory overhead
 * ArrayDeque maintains Re-sizable array data structure, LinkedList maintains doubly linked list
 * Insertion / Deletion in same for both O(1)
 * Re-size automatically in ArrayDeque, LinkedList grows Dynamically
 * Null values are not allowed in ArrayDeque and null is allowed in LinkedList
 * ArrayDeque is based on contiguous memory allocation, LinkedList is non-contiguous memory allocation
 * 
 * When to use:
 * Heterogeneous data is input
 * Duplicate entries are there
 * Insertion order has to be maintained
 * No null insertion 
 */

import java.util.ArrayDeque;
import java.util.Iterator;
public class ArrayDequeColl {
	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		ad.add(60);
		System.out.println(ad); //[10, 20, 30, 40, 50, 60]
		
		//Iteration through ArrayDeque
		//1. For-each loop
		for(Object i:ad) {
			System.out.print(i+" "); //5 10 20 30 40 50 60 70
		}
		
		//2. Iterator
		Iterator cur = ad.iterator();
		while(cur.hasNext()) {
			System.out.print(cur.next()+" "); //5 10 20 30 40 50 60 70
		}
		
		//3.descendingIterator
		Iterator curl = ad.descendingIterator();
		while(curl.hasNext()) {
			System.out.print(curl.next()+" "); //70 60 50 40 30 20 10 5
		}
		
		//Methods of ArrayDeque
		ad.addFirst(5);
		ad.addLast(70);
		System.out.println(ad); //[5, 10, 20, 30, 40, 50, 60, 70]
		ad.removeFirst(); //Removes the first element
		ad.removeLast(); //Removes the last element
		System.out.println(ad); //[10, 20, 30, 40, 50, 60]
		System.out.println(ad.peek()); //First element in ArrayDeque
		System.out.println(ad.getFirst()); //Just returns the first element wont remove ->10
		System.out.println(ad.getLast()); //Just returns the last element  wont remove -> 60
		
		
	}
}