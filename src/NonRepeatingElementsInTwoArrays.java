import java.util.*;
public class NonRepeatingElementsInTwoArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }
        int[] res = arrayMerge(arr1, arr2);
        Arrays.sort(res); 
        countNonRepeating(res);
    }
    public static int[] arrayMerge(int[] arr, int[] arr2){
        int[] res = new int[arr.length+arr2.length];
        for(int i=0;i<arr.length;i++){
            res[i] = arr[i];
        }
        for(int i=0;i<arr2.length;i++){
            res[arr.length+i] = arr2[i];
        }
        return res;
    }
    public static void countNonRepeating(int[] arr){
        int count = 1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }else{
                if(count==1){
                    System.out.print(arr[i]+" ");
                }
                count=1;
            }
        }
        if(count==1){
            System.out.print(arr[arr.length-1]+" ");
        }
    }
}
