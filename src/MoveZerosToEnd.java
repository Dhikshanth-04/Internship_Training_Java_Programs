/*
2. Move the Zeros of the given array to end
Constraints : Make the in-place arrangements, return the modified array

Algorithm:
1. Alter the places of non-zero elements to beginning
2. Fill the remaining indices with 0
3. Print the array as String array

Note : i-Traversal, index-position of element
Time complexity : O(n)
*/
import java.util.*;
public class MoveZerosToEnd {
   public static void main(String[] args){
    int arr[] = {0,1,0,3,4,0,5};
    int index = 0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            arr[index++] = arr[i];
        }
    }
    while(index<arr.length){
        arr[index++] = 0;
    }
    System.out.println(Arrays.toString(arr));
   }
}

