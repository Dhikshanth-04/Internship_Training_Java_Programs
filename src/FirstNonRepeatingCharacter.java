/*

1. Find the first non repeating character of the string;
Algorithm:
1. Declare int array with size of 256(ascii value count)
2. Count the frequency of each character
3. Return "i" if the character frequency == 1
4. If no character with frequency 1, return -1 (no non repeating character)

Time complexity : O(n)

*/

public class FirstNonRepeatingCharacter {
    static int firstNonRepeatChar(String str){
        int index[] = new int[256];
        boolean flag = true;
        for(int i=0;i<str.length();i++){
            index[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(index[str.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String str = "swwiiss";
        int res =  firstNonRepeatChar(str);
        if(res==1){
            System.out.print(str.charAt(res));
        }
        else{
            System.out.print("No non repeating characters");
        }
    }
}
