import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    // 회의의 수

        int[][] time = new int[N][2];

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            time[i][0] = Integer.parseInt(st.nextToken()); // 회의 시작시간
            time[i][1] = Integer.parseInt(st.nextToken()); // 회의 종료시간
        }

        Arrays.sort(time, (o1, o2) -> { // 종료시간 빠른 순 정렬
            if (o1[1] == o2[1]) {   // 종료시간 같으면 시작시간 빠른 순으로 정렬
                return Integer.compare(o1[0], o2[0]);
            } else {
                return Integer.compare(o1[1], o2[1]);
            }
        });
        
        int count = 0;
        int end_time = 0;
        
        for (int i = 0; i < N; i++) {
            // 종료시간이 다음 회의 시작시간보다 이르거나 같으면 count
            if (end_time <= time[i][0]) {
                end_time = time[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}