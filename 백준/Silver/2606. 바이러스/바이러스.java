import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 7
 * 6
 * 1 2
 * 2 3
 * 1 5
 * 5 2
 * 5 6
 * 4 7
 */
public class Main {
    // 노드 7개 간선 6개
    static ArrayList<Integer>[] A; //1에 [] 2에 []..7까지
    static boolean visited[]; // 7개
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        A = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        // 인접 노드들 추가
        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<Integer>();
        }
        for (int j = 1; j <= m; j++) {
             st = new StringTokenizer(br.readLine());

            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());

            A[v1].add(v2);
            A[v2].add(v1);
        }

        // 탐색
        DFS(1);

        System.out.println(count);
    }

    private static void DFS(int v) {
        if (visited[v]) {
            return;
        }

        visited[v] = true;
        for (int i : A[v]) {
            if (!visited[i]) {
                count++;
                DFS(i);
            }
        }
    }
}