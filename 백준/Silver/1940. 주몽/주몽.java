import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);
        int start_index = 0, end_index = N-1;
        int count = 0;
        while (start_index != end_index) {
            if (num[start_index] + num[end_index] < M) {
                start_index++;
            } else if (num[start_index] + num[end_index] > M) {
                end_index--;
            } else {
                count++;
                start_index++;
            }
        }
        System.out.println(count);
    }
}