import java.util.*;
class RemoveDeuplicateCharacters{
    public static String removeDuplicateChar(String str){
        String t = "";
        boolean[] arr = new boolean[256];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!arr[ch]){
                t = t+ch;
                arr[ch] = true;
            }
        }
        return t;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = removeDuplicateChar(str);
        System.out.println(res);
    }
}