import java.util.Scanner;
public class CommonElementsAsc_Desc {
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
        commonOdd(arr1, arr2);
    }
    public static void commonOdd(int[] arr1, int[] arr2){
        int i = 0;
        int j = arr2.length-1;
        boolean flag = true;
        while(i<arr1.length && j>0){
            if(arr1[i] == arr2[j]){  
                System.out.println(arr1[i]+" ");
                flag = false;
                i++;
                j--;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }else{
                j--;
            }
        }
        if(flag){
            System.out.println("No common odd elements found.");
        }
    }
}
