/*
11. Pair of elements to give sum
Algorithm:
1) Declare the hashset to store the number
2) Traverse through array
3) calculate val = target-arrayElement
4) if val and its corresponding num is available in set, print the pair
*/

import java.util.*;

public class SumPair {
    public static void main(String[] args){
        int[] arr = {2,7,4,11,15,5};
        int target = 9;
        
        Set<Integer> seen = new HashSet<>();
        
        for(int num : arr){
            int complement = target - num;
            
            if(seen.contains(complement)){
                System.out.println("(" + complement + "," + num + ")");
            }
            
            seen.add(num);
        }
    }
}
