import java.util.Random;
import java.util.Scanner;

public class fibo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int[] f = series(k);
        for (int x : f) {
            System.out.print(x + " ");
        }

    }


    public static int[] series(int n) {
        int[] fibo = new int[n];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        return fibo;

    }
}