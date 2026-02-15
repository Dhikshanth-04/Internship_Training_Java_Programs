/*
7. Longest substring without repeating characters
Algorithm;
1) Create a hashset
2) Add the characters from string - right elements
3) Remove the characters from left untill the current element is not duplicate
4) maxLenght would be max of( max, right-left+1)
*/
import java.util.*;
public class LongestSubstring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Set<Character> sub = new HashSet<>();
        int left = 0;
        int max = 0;
        for(int right=0;right<str.length();right++){
            while(sub.contains(str.charAt(right))){
                sub.remove(str.charAt(left));
                left++;
            }
            sub.add(str.charAt(right));
            max = Math.max(max, right-left+1);
        }
        System.out.print(max);
    }
}