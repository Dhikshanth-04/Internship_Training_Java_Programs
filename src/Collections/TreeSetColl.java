/*
 * TreeSet
 * Hierarchy : TreeSet -> Navigatable Set -> SortedSet -> Set -> Collections -> Iterable
 * Initial Capacity : 10
 * Internal data structure : Binary Search Tree (or) Red Black Tree
 * Stores data in the sorted order
 * No heterogeneous data, because the comparision is done, gives Exception of "ClassCastException"
 * Null values are also not allowed, gives exception of "NullPointerException"
 * Duplicates are not allowed
 * Strings are compared through uni-code
 * It traverse through In-Order Traversal
 * Retrieval of the element through in-order traversal
 * 5 Constructors
 * 
 * When to use :
 * Sorted maintenance of elements
 * Duplicates should not allowed
 * Range operations : subSet
 * Insertion / Accessing : O(log(n))
 *  
 * 
 */

import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetColl {
public static void main(String[] args) {
TreeSet ts = new TreeSet();
ts.add(10);
ts.add(30);
ts.add(50);
ts.add(20);
ts.add(40);
ts.add(60);
System.out.println(ts); //[10, 20, 30, 40, 50, 60]

//Methods of TreeSet
System.out.println(ts.first()); //Lowest or first element in set -> 10
System.out.println(ts.last()); //Largest or last element in set -> 60
System.out.println(ts.headSet(40)); //Prints the element within the range, from beginning -> [10, 20, 30]
System.out.println(ts.tailSet(40)); //Prints the element above the range -> [40, 50, 60]
System.out.println(ts.subSet(15, 50));//prints the elements within the range -> [20, 30, 40]
System.out.println(ts.ceiling(43)); //Prints the closest large value -> 50 (if 43 presents returns 43)
System.out.println(ts.floor(43)); //Prints the closest small value -> 40 (is 43 is present returns 43)
System.out.println(ts.higher(40)); //Prints the first  large value, even 40 is present -> 50
System.out.println(ts.lower(40)); //Prints the first small value, even 40 is present -> 30
System.out.println(ts.pollFirst()); //Removes the first element, 10
System.out.println(ts.pollLast()); //Removes the last elemtn, 60
System.out.println(ts);// [20, 30, 40, 50]

//Iteration through TreeSet
//1. For-each loop
for(Object i:ts) {
	System.out.print(i+" "); //20 30 40 50
}

//2. Iterator
Iterator cur = ts.iterator();
while(cur.hasNext()) {
	System.out.print(cur.next()+" "); //20 30 40 50
}

//3.descendingIterator
Iterator curl = ts.descendingIterator();
while(curl.hasNext()) {
	System.out.print(curl.next()+" "); //20 30 40 50
}
}
}