/*
 * HashMap 
 * Hierarchy : HashMap -> Map
 * Initial capacity : 16
 * Internal Data structure : Hash table
 * Heterogeneous data are allowed
 * Null can be input
 * Duplicate value is allowed, Duplicate key is not allowed
 * Insertion order is not preserved 
 * Re-Sizing : Once the 75% of the set is filled, the set size will be doubled, 16 to 32, this is load Factor
 * 
 * 
 * LinkedHashMap
 * Hierarchy : LinkedHashMap -> SequencedMap -> Map
 * Initial capacity : 16
 * Internal Data structure : Hash table
 * Heterogeneous data are allowed
 * Null can be input
 * Duplicate value is allowed, Duplicate key is not allowed
 * Insertion order is preserved 
 * Re-Sizing : Once the 75% of the set is filled, the set size will be doubled, 16 to 32, this is load Factor
 * 
 * 
 * TreeMap
 * Hierarchy : TreeMap -> NavigableMap -> SortedMap -> SequencedMap -> Map
 * Internal data structure is Red Black Tree
 * Heterogeneous key are not allowed, because comparision is based on key
 * Duplicate value is allowed, Duplicate key is not allowed
 * null value is not allowed, leads to NullPointerException
 * Sorted order of values are maintained
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapColl {
public static void main(String[] args) {

System.out.println("=== HashMap Example ===");
HashMap<Integer, String> hm = new HashMap<>();
HashMap<Integer, String> hm1 = new HashMap<>();

hm.put(3, "C");
hm.put(1, "A");
hm.put(4, "D");
hm.put(2, "B");
hm.put(5, "E");
System.out.println("Original HashMap: " + hm); // Original HashMap: {1=A, 2=B, 3=C, 4=D, 5=E}

hm1.put(4, "D");
hm1.put(6, "F");

System.out.println("Contains key 3? " + hm.containsKey(3)); //Contains key 3? true
System.out.println("Contains value 'B'? " + hm.containsValue("B")); //Contains value 'B'? true

hm.putAll(hm1); // Merge
System.out.println("After putAll: " + hm); //After putAll: {1=A, 2=B, 3=C, 4=D, 5=E, 6=F}

hm.remove(2);
System.out.println("After remove key 2: " + hm); //After remove key 2: {1=A, 3=C, 4=D, 5=E, 6=F}
hm.clear();
System.out.println("After clear: " + hm); //After clear: {}




System.out.println("\n=== LinkedHashMap Example ===");
LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
LinkedHashMap<Integer, String> lhm1 = new LinkedHashMap<>();

lhm.put(3, "C");
lhm.put(1, "A");
lhm.put(4, "D");
lhm.put(2, "B");
lhm.put(5, "E");
System.out.println("Original LinkedHashMap: " + lhm); // Original LinkedHashMap: {3=C, 1=A, 4=D, 2=B, 5=E}


lhm1.put(4, "D");
lhm1.put(6, "F");

System.out.println("Contains key 3? " + lhm.containsKey(3));
System.out.println("Contains value 'B'? " + lhm.containsValue("B"));

lhm.putAll(lhm1); // Merge
System.out.println("After putAll: " + lhm);

lhm.remove(2);
System.out.println("After remove key 2: " + lhm);
lhm.clear();
System.out.println("After clear: " + lhm);




System.out.println("\n=== TreeMap Example ===");
TreeMap<Integer, String> tm = new TreeMap<>();
TreeMap<Integer, String> tm1 = new TreeMap<>();

tm.put(3, "C");
tm.put(1, "A");
tm.put(4, "D");
tm.put(2, "B");
tm.put(5, "E");
System.out.println("Original TreeMap: " + tm); // Original TreeMap: {1=A, 2=B, 3=C, 4=D, 5=E}

tm1.put(4, "D");
tm1.put(6, "F");

System.out.println("Contains key 3? " + tm.containsKey(3));
System.out.println("Contains value 'B'? " + tm.containsValue("B"));

tm.putAll(tm1); // Merge
System.out.println("After putAll: " + tm);

tm.remove(2);
System.out.println("After remove key 2: " + tm);
tm.clear();
System.out.println("After clear: " + tm);

TreeMap<Integer, String> dem = new TreeMap();
dem.put(1, "A");
dem.put(3, "C");
dem.put(5, "E");
dem.put(2, "B");
dem.put(4, "D");

//Iteration through Map
//1. For-each loop - keySet
for(Object i : dem.keySet()) {
	System.out.println(i+" "+dem.get(i));
}

//2. For-each loop - Entry set
for (Map.Entry<Integer, String> entry : dem.entrySet()) {
    System.out.println(entry.getKey() + " " + entry.getValue());
}

}
}