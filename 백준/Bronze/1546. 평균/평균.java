import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = Integer.parseInt(st.nextToken());
        int sum = max;
        for(int i=0; i<N-1; i++){
            int score = Integer.parseInt(st.nextToken());
            if (score > max) max = score;
            sum += score;
        }
        System.out.println((double) sum/max*100/N);
    }
}