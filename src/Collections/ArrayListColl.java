/*
 * Arraylist 
 * Hierarchy : Arraylist -> List -> SequencedCollection -> Collection -> Iterable
 * Default capacity : 10
 * Internal data structure : Re-Sizable array
 * New capacity : [currentCapacity *(3/2)] + 1
 * 3 Constructors
 * 
 * When to use:
 * Storing heterogeneous data
 * Duplicate entries
 * Null insertion
 * Insertion order is maintained
 * 
 * Accessing : Without re-sizing O(1), with re-sizing O(n)
 * 
 * Arrays Vs ArrayList
 * Arrays the sizes are fixed, ArrayList - sizes shrinks and expands automatically
 * Arrays can store primitive data types and objects, ArrayList can store only objects(Wrapper-classes)
 * Arrays are less-flexible, ArrayList are more flexible with multiple methods
 * Arrays has no overheads, ArrayList has overhead
 * 
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListColl {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		//Methods of ArrayList
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(0,20); //add at specific index
		al.set(1,30); //modify the element at specific index
		
		al.add(null); //null insertion is allowed
		System.out.println(al);
		System.out.println(al.get(2)); //retrive the element at specific index
		
		//Remove the element from ArrayList
		al.remove(1);
		
		//Get the index of the element
		System.out.println(al.indexOf(20));
		
		//Checks whether the element is found or not
		System.out.println(al.contains(30));
		
		//Size of ArrayList
		System.out.println(al.size());
		
		//checks whether the ArrayList is empty or not
		System.out.println(al.isEmpty());
		
		//Prints the elements within the range
		System.out.println(al.subList(2, 4)); //start - inclusive, end - exclusive
		
		//ArrayList can be iterated through for loop
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		//ArrayList can also be iterated through for-each loop
		for(Object i: al) {
			System.out.println(i);
		}
		//ArrayList can be iterated through Iterator
		Iterator<Object> cur = al.iterator();
		while(cur.hasNext()) {
			System.out.println(cur.next());
		}
		//ArrayList can be iterated through ListIterator
		ListIterator curl = al.listIterator();
		while(curl.hasPrevious()) {
			System.out.println(curl.hasPrevious());
		}
	}
}

