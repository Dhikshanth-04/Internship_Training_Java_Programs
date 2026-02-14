/*
6. Remove duplicate elemts in array
Algorithm:
1) Declare a hashset, add the elements from array to it
2) Hashset takes only unique values, print the set
*/

import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args){
        int arr[] = {1,2,3,3,2,1,4,5,6,6,5,4};
        Set<Integer> removed = new HashSet<>();
        for(int i:arr){
            removed.add(i);
        }
        System.out.print(removed);

    }    
}
