import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
        int[] value = new int[N];
        for (int i = 0; i < N; i++) {
            value[i] = sc.nextInt();
        }
        for (int i = N - 1; K != 0; i--) {
            if (value[i] <= K) {
                count += K / value[i];
                K %= value[i];
            }
        }
        System.out.println(count);
    }
}