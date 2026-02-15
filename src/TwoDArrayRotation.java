class TwoDArrayRotation{
    static void transpose(int[][] arr){
        int n = arr.length;
        int[][] res = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[j][i] = arr[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void clockwiseRotation(int[][] arr){
        //Transpose the array
        int n = arr.length;
        int[][] res = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[j][i] = arr[i][j];
            }
        }
        //Reverse coloumn wise
        for(int i=0;i<n;i++){
            int left = 0;
            int right = n-1;
            while(left<right){
                int temp = res[i][left];
                res[i][left] = res[i][right];
                res[i][right] = temp;
                left++;
                right--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void antiClockwiseRotation(int[][] arr){
        //Tranpose the array
        int n = arr.length;
        int[][] res = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[j][i] = arr[i][j];
            }
        }
        //Reverse row wise
        for(int i=0;i<n;i++){
            int top = 0;
            int bottom = n-1;
            while(top<bottom){
                int temp = res[top][i];
                res[top][i] = res[bottom][i];
                res[bottom][i] = temp;
                top++;
                bottom--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void upSideDownRotation(int[][] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int left = 0;
            int right = n-1;
            while(left<right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
        for(int i=0;i<n;i++){
            int top = 0;
            int bottom = n-1;
            while(top<bottom){
                int temp = arr[top][i];
                arr[top][i] = arr[bottom][i];
                arr[bottom][i] = temp;
                top++;
                bottom--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        transpose(arr);
        System.out.println();
        clockwiseRotation(arr);
        System.out.println();
        antiClockwiseRotation(arr);
        System.out.println();
        upSideDownRotation(arr);
    }
}