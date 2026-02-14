/*
4. Check anagram
algorithm;
1) check the lengths of strings-mismatches end there
2) declare array with length of alphabets
3) take each letter from str1 and add the count in freq array
4) take each letter from str2 and subtract from the freq array
5) traverse through the freq array, if any values more than 0, its not anagram, else anagram 
*/
public class Anagram {
    public static void main(String[] args){
        String str1 = "madam";
        String str2 = "amkma";
        if(str1.length()!=str2.length()){
            System.out.print("Not anagram");
            return;
        }
        int[] freq = new int[26];
        for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i)-'a']++;
            freq[str2.charAt(i)-'a']--;
        }
        for(int count : freq){
            if(count!=0){
                System.out.println("Not anagram");
                return;
            }
        }
        System.out.print("Anagram");
    }
}
