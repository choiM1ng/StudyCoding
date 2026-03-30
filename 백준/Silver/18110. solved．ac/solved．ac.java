import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] difficulty = new int[n];
        for (int i = 0; i < n; i++) {
            difficulty[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(difficulty);

        int ex = (int) Math.round(n * 0.15);

        double sum = 0;
        for (int i = ex; i < n - ex; i++) {
            sum += difficulty[i];
        }

        int result = (int) Math.round(sum / (n - ex * 2));
        System.out.println(result);
    }
}