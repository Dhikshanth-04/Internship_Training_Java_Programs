import java.util.Scanner;
public class MatrixSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] mat = new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		matrixSort(mat, row, col);
	}
	public static void matrixSort(int[][] mat, int row, int col) {
		int[] res = new int[row*col];
		int index = 0;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				res[index++] = mat[i][j];
			}
		}
		for(int i=0; i<res.length-1; i++) {
			for(int j=0; j<res.length-i-1; j++) {
				if(res[j] > res[j+1]) {
					int temp = res[j];
					res[j] = res[j+1];
					res[j+1] = temp;
				}
			}
		}
		index = 0;
		for(int i=0; i<row;i++){
			for(int j=0; j<col; j++){
				System.out.print(res[index]+" ");
				index++;
			}
			System.out.println();
		}
	}
}