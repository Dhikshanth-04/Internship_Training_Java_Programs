import java.util.Scanner;

public class OccurenceOfChar {
    public static String occurenceOfChar(String str){
        String t = "";
        int[] arr = new int[256];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            arr[ch]++;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                t = t+(char)i + arr[i];
            }
        }
        return t;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = occurenceOfChar(str.toLowerCase());
        System.out.println(res);
    }    
}
