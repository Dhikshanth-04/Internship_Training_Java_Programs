import java.util.*;
public class jagged_array {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int block = sc.nextInt();
    int[][][] a = new int[block][][];
    for(int i=0; i<block; i++){
        System.out.println("Enter the row size of block "+(i)+": ");
        int row = sc.nextInt();
        a[i] = new int[row][];

        for(int j=0;j<row; j++){
            System.out.println("Enter the Coloumn size of the block "+(i)+" and row size "+(j)+" : ");
            int col = sc.nextInt();
            a[i][j] = new int[col];
        }
    }
}
    
}
