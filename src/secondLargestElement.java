import java.util.*;

public class secondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (ar[i] > max) {
                smax = max;
                max = ar[i];
            } else if (ar[i] > smax && ar[i] != max) {
                smax = ar[i];
            }
        }

        if (smax == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println(smax);
        }

        sc.close();
    }
}
