import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] visited;   // 방문 배열
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int N, M;
    static int[][] miro;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N][M];
        miro = new int[N][M];
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < M; j++) {   // 데이터 저장
                miro[i][j] = Integer.parseInt(temp.substring(j, j + 1));
            }
        }
        BFS(0, 0);
        System.out.println(miro[N - 1][M - 1]);
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            int now[] = queue.poll();
            for (int k = 0; k < 4; k++) {    // 상하좌우 탐색
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x >= 0 && y >= 0 && x < N && y < M) {    // 유효한 좌표인지 확인
                    if (miro[x][y] != 0 && !visited[x][y]) {    // 이동할 수 있는 좌표인지, 방문한 적 없는 좌표인지
                        visited[x][y] = true;
                        miro[x][y] = miro[now[0]][now[1]] + 1;    // depth +1
                        queue.add(new int[]{x, y});
                    }
                }
            }
        }
    }
}