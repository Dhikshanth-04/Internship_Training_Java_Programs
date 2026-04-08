/*
 * HashSet
 * Hierarchy : HashSet -> Set -> Collections -> Iterable
 * Internal Data structure : Hash table
 * Initial capacity : 16 (bucket locations)
 * Storage : inputData -> hashFunction -> HashAddress(Storage location in set), This is Hashing
 * Re-Sizing : Once the 75% of the set is filled, the set size will be doubled, 16 to 32, this is load Factor
 * Heterogeneous data, null values are allowed
 * No Duplicates are allowed
 * Order of insertion is not preserved
 * Accessing / Insertion : O(1)
 * 
 * HashSet Vs TreeSet
 * Order of insertion is not preserved in HashSet, Sorted order in TreeSet
 * Null value is allowed in HashSet, Not allowed in TreeSet
 * Heterogeneous data allowed in HashSet, not allowed in TreeSet
 * Implements only Set, TreeSet implements NavigatableSet, SortedSet
 * 
 * When to use :
 * Order  of insertion is not important
 * Duplicates should not be included
 * Easier to Insert and Access
 * 
 */

import java.util.HashSet;
import java.util.Iterator;
public class HashSetColl {
public static void main(String[] args) {
HashSet hs = new HashSet();
HashSet hs1 = new HashSet();
hs.add(10);
hs.add(20);
hs.add(30);
hs.add(40);
hs.add(50);
hs.add(60);
System.out.println(hs); //[30, 40, 20, 10, 50, 60] - Insertion order is not preserved

hs1.add(60);
hs1.add(80);
hs1.add(90);

//Iteration through HashSet
//1. For-Each Loop
for(Object i : hs) {
    System.out.print(i+" "); //50 40 20 10 30
}

//2.Iterator
Iterator cur = hs.iterator();
while(cur.hasNext()) {
    System.out.print(cur.next()+" "); //40 50 20 10 30 
}


//Methods of HashSet
System.out.println(hs.remove(30)); //Returns true, once removed
System.out.println(hs); //[20, 40, 50, 10, 60]

System.out.println(hs.contains(40)); //Returns true/false

hs.retainAll(hs1);
System.out.println(hs); //Returns the elements same from both sets and store in set -> hs = [60]

hs.addAll(hs1);
System.out.println(hs); //[80, 70, 60, 90, 20, 30 40, 50, 10] merges two sets

hs.removeAll(hs1);
System.out.println(hs); //Removes the common elements in both sets and store rest elements in set

hs.clear(); //Removes all data from set
System.out.println(hs);
	
}
}