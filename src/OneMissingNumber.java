/*
9. Find one missing number from 0 to n array
Algorithm:
1) Calculate the sum of 'n' numbers
2) Calculate the  sum of array elements
3) Subtract array sum - total sum
*/

public class OneMissingNumber {
    public static void main(String[] args){
        int[] arr = {1,2,3,5};
        int expOutput = arr.length+1*(arr.length+2)/2;
        int sum = 0;
        for(int i : arr){
            sum+=i;
        }
        System.out.print(sum-expOutput);
    }
}
