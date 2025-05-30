import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());   // 연산 개수
        arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int request = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (request == 0) union(a, b);
            else checkSame(a, b);
        }
    }

    private static void checkSame(int a, int b) {
        a = find(a);
        b = find(b);
        if (a == b) System.out.println("YES");
        else System.out.println("NO");
    }

    private static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) arr[b] = a;
    }

    private static int find(int n) {
        if (n == arr[n]) return n;
        else return arr[n] = find(arr[n]);
    }
}