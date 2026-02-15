/*
10. Second largest element in array, without sorting
with only one traversal
Algorithm:
1) Declare max and smax = Integer.minvalue
2) iterate through array, if(arr[i]>max) => smax = max and max = arr[i]
3) to meet edge cases => else if(arr[i]>smax && arr[i]!=max)
4) Print smax
*/
import java.util.*;
public class secondLargestElement{
    public static void main(String[] args){
        int[] arr = {10,9,8,7,6};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max){
                smax = max;
                max = i;
            }else if(i>smax && i!=max){
                smax = i;
            }
        }
        System.out.print(smax);
    }
}