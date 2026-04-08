/*
 * LinkedList
 * Hierarchy : LinkedList -> List, Deque, Queue -> SequencedCollection -> Collection -> Iterable
 * Initial capacity : 0
 * Internal data structure : Doubly linked list
 * Efficient in insertion and deletion 
 * Traversing is slower
 * LinkedList allows heterogeneous data
 * Non-contiguous memory allocation
 * Insertion order is maintained
 * Duplicates are also allowed, Null insertion too
 * It has the methods of ArrayList because, both of them implements the same Class List
 * Apart from that, LinkedList also implements Deque and Queue
 * 
 * When to use:
 * Frequent insertion/ deletion is happening
 * Insertion order has to be maintained
 * Heterogeneous and Duplicates can be input
 * 
 * 
 * ArrayList Vs LinkedList
 * Arraylist uses Re-Sizable array, LinkedList used Doubly-linked list
 * ArrayList is efficient for traversal, LinkedList is efficient for Insertion/Deletion
 * ArrayList wastes memory, LinkedList optimizes the memory
 */


import java.util.Iterator;
import java.util.ListIterator;
import java.util.LinkedList;
public class LinkedListColl {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10); //list
		ll.add(30); //list
		
		ll.push(20); //stack
		ll.push(40); //stack
		System.out.println(ll); //[40, 20, 10, 30]
		
		//Queue methods of linkedList
		System.out.println(ll.peek()); //First element of the LinkedList -> 40
		System.out.println(ll.element()); //View the head element of the LinkedList -> 40
		System.out.println(ll.remove()); //Removes the head element from the LinkedList -> 40
		System.out.println(ll.poll()); //Removes the element at the head ->20
		System.out.println(ll); //[10, 30]
		
		//Deque methods of LinkedList
		ll.addFirst(5); //Insert element at first
		ll.addLast(50); //Insert element at last
		System.out.println(ll); //[5, 10, 30, 50]
		System.out.println(ll.getFirst()); //Returns the first element of the LinkedList -> 5
		System.out.println(ll.getLast()); //Returns the last element of the LinkedList -> 50
		System.out.println(ll.removeFirst()); //Removes the  first element from LinkedList -> 5
		System.out.println(ll.removeLast()); //Removes the last element from LinkedList -> 50
		System.out.println(ll); //[10, 30]
		
		
		//Iteration of LinkedList
		//1. Iterator
		ListIterator curl = ll.listIterator();
		while(curl.hasNext()) {
			System.out.println(curl.next()+" "); //10 30
		}
		
		//2.ListIterator
		while (curl.hasPrevious()) {
			System.out.println(curl.previous()); //30 10
		}
		
		//3.descendingIterator
		Iterator desCur = ll.descendingIterator();
		while(desCur.hasNext()) {
			System.out.println(desCur.next()); //30 10
		}	
	}
}
