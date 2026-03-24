import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrderUniqueChar {
    public static String ascendingOrderUniqueChar(String res){
        String t = "";
        char[] arr = res.toCharArray();
        Arrays.sort(arr);
        t = new String(arr);
        return t;
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        RemoveDeuplicateCharacters rm = new RemoveDeuplicateCharacters();
        String str = sc.nextLine();
        String res = rm.removeDuplicateChar(str);
        String fin = ascendingOrderUniqueChar(res);
        System.out.println(fin);
    }
}
