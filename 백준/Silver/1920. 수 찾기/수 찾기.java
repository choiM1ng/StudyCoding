import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            int startIndex = 0;
            int endIndex = N - 1;
            while (startIndex <= endIndex) {
                int midIndex = (startIndex + endIndex) / 2;
                if (A[midIndex] == num) {
                    System.out.println(1);
                    break;
                } else if (A[midIndex] < num) {
                    startIndex = midIndex + 1;
                } else {
                    endIndex = midIndex - 1;
                }
            }
            if(startIndex > endIndex) System.out.println(0);
        }
    }
}