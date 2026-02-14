/*
3. Check Palindrome;
Algorithm:
1) Convert the string into lowercase
2) Declare left as initial character, right as last character
3) Initiate while loop as left<right
4) check the characters of string in left index nad right index
5) if not same, break the loop
6) if loop continues and flag remains true print palindrome, else not palindrome

Time complexity : O(n)
Method : Two pointer method

*/
public class Palindrome {
    public static void main(String[] args){
        String str = "madame";
        str = str.toLowerCase();
        int left = 0;
        int right = str.length()-1;
        boolean flag = true;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                flag = false;
                break;
            }
            left++;
            right--;
        }
        if(flag){
            System.out.print("palindrome");
        }
        else{
            System.out.print("not palindrome");
        }
    }
}
