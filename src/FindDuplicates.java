/*
5. Find the duplicate elements in the array
Algorithm :
1) Declare 2 HashSet seen and duplicate
2) Traverse through the array
3) Try to insert it in seen set, if can add its unique value
4) If cannot add, its duplicate value store in duplicate set
5) Print the duplicate set

Tech- HashSet;
    HashSet is the collection that stores only the unique values, insertion order
    is not maintained. Super fast manipulation with O(1) complexity.
*/
import java.util.*;
public class FindDuplicates{
    public static void main(String[] args){
        int arr[] = {1,2,3,3,5,4,7,2,1,6,5};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for(int i:arr){
            if(!seen.add(i)){
                duplicate.add(i);
            }
        }
        System.out.print(duplicate);
    }
}