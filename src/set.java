import java.util.HashSet;
import java.util.Scanner;

public class set {
    public static void storeInSet(String str){
        String[] t = str.split(",");
        HashSet <String> set = new HashSet<String>();
        for(int i=0; i<t.length; i++){
            set.add(t[i]);
        }
        for(String i : set){
            System.out.println(i);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        storeInSet(str);
    }
}
