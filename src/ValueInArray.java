public class ValueInArray {
    public static void main(String[] args){
        int[] arr = {4,3,7,11,50,1};
        int x = 4;
        int y = 10;
        if(x>y){
            return;
        }
        for(int i:arr){
            if(i>x && i<y){
                System.out.print(i);
            }
        }

    }
}
