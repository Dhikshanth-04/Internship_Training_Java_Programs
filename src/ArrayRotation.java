/*
8. Array rotation at 'k' elements
Algorithm:
1) alter k value, that it does not exceeds the array length
2) Using two pointer method, create the reverse function
3) Reverse an entire array
4) Reverse the k value elements
5) Reverse from k to whole array

Time complexity : O(n)
*/
import java.util.*;
class ArrayRotation{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int k = 3;
        k = k%arr.length;
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k);
        reverse(arr, k, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr, int start, int end){
        int temp = 0;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}