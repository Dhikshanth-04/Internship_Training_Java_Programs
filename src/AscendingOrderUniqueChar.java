import java.util.Scanner;

public class AscendingOrderUniqueChar {
    public static String ascendingOrderUniqueChar(String res){
        String t = "";
        char[] arr = res.toCharArray();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
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
