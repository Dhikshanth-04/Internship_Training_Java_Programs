// Given an array of integers, return indices of the two numbers such that they add up to a target.
// Input:
// nums = [2,7,11,15], target = 9

// Output:
// [0,1]
package Interview;
import java.util.*;
public class sumIndicesToK {
    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if(map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(arr[i], i);
        }

        return new int[] {}; // no solution case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[] result = twoSum(arr, target);

        if(result.length == 0) {
            System.out.println("No solution found");
        } else {
            System.out.println("[" + result[0] + "," + result[1] + "]");
        }
    }
}