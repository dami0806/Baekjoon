import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 6 5
 * 1 2 ArrayList[]
 * 2 5
 * 5 1
 * 3 4
 * 4 6
 */
public class Main {
    static ArrayList<Integer>[] A; // 1 2 3 4 5 6
    static boolean[] visited; // 1 false, 2 false 3...
    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        A = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<Integer>();
        }
        for (int j = 1; j <= m; j++) {
            // m개의 간선 5줄을 입력 받았음 1 2 일때 1->2 2->1
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            A[v1].add(v2);
            A[v2].add(v1);
        }
        for(int i = 1; i <= n; i++) {
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }

        System.out.println(count);
    }

    private static void DFS(int v) {
        // 한번 방문했으면 return;
        if (visited[v]) {
            return;
        }

        visited[v] = true; // 2를 true로 바꾸고 그 인접한거 확인
        for (int i : A[v]) { //2->3 4 5 6일때
            if (!visited[i]) {
                DFS(i);
            }
        }
    }
}