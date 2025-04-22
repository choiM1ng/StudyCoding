import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] graph;
    static int[] check;
    static boolean[] visited;
    static boolean isTrue;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int testcase = Integer.parseInt(br.readLine());
        for (int t = 0; t < testcase; t++) {
            st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());   // 정점의 개수
            int E = Integer.parseInt(st.nextToken());   // 간선의 개수
            graph = new ArrayList[V + 1];
            visited = new boolean[V + 1];
            check = new int[V + 1];
            isTrue = true;
            for (int i = 1; i <= V; i++) {
                graph[i] = new ArrayList<>();
            }
            for (int i = 0; i < E; i++) {   // 간선 데이터 저장
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                graph[start].add(end);
                graph[end].add(start);
            }
            // 모든 노드에서 DFS 실행
            for (int i = 1; i <= V; i++) {
                if (isTrue) DFS(i);
                else break;
            }
            if(isTrue) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static void DFS(int i) {
        visited[i] = true;
        for (int next : graph[i]) {
            if(!visited[next]) {
                check[next] = (check[i] + 1) % 2;
                DFS(next);
            } else {
                if (check[i] == check[next]) isTrue = false;
            }
        }
    }
}