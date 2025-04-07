import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] list;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 정점의 개수
        int M = Integer.parseInt(st.nextToken());   // 간선의 개수
        int count = 0;  // 연결요소의 개수
        list = new ArrayList[N+1];  // 인접리스트
        visited = new boolean[N+1]; // 방문 배열
        for (int i = 1; i < N + 1; i++) {
            list[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list[s].add(e);
            list[e].add(s);
        }

        for (int i = 1; i < N + 1; i++) {
            if (!visited[i]){   //아직 방문하지 않은 노드가 있으면
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int i) {
        if (visited[i]) return; // 현재 노드 == 방문했던 노드
        visited[i] = true;
        for (int n : list[i]) {
            if (!visited[n]) {  // 인접리스트의 노드 중에 방문 안한 노드가 있으면
                DFS(n);
            }
        }
    }
}