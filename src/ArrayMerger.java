import java.util.*;
public class ArrayMerger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }
        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];
        for(int i=0;i<arr3.length;i++){
            arr3[i] = sc.nextInt();
        }
        arrayMerge(arr, arr2, arr3);
    }
    public static void arrayMerge(int[] arr, int[] arr2, int[] arr3){
        int[] res = new int[arr.length+arr2.length+arr3.length];
        for(int i=0;i<arr.length;i++){
            res[i] = arr[i];
        }
        for(int i=0;i<arr2.length;i++){
            res[arr.length+i] = arr2[i];
        }
        for(int i=0;i<arr3.length;i++){
            res[arr.length+arr2.length+i] = arr3[i];
        }
        System.out.print("Merged array: ");
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}
