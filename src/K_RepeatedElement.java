import java.util.*;
public class K_RepeatedElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(kRepeat(arr, k));
    }
    public static int kRepeat(int[] arr, int k){
        int count = 0;
        for(int i:arr){
            if(i==k){
                count++;
            }
        }
        return count;
    }
}
