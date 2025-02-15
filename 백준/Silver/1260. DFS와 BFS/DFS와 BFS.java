import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 4 5 1
 * 1 2
 * 1 3
 * 1 4
 * 2 4
 * 3 4
 */
public class Main {

    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static int N, M, V;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); //4개 5개 관계
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        A = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            A[v1].add(v2);
            A[v2].add(v1);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(A[i]);
        }

        DFS(V);
        System.out.println(sb.toString().trim());

        visited = new boolean[N + 1];

        sb = new StringBuilder();
        BFS(V);
        System.out.println(sb.toString().trim());

    }

    private static void DFS(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        sb.append(v).append(" ");

        for (int i : A[v]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }

    private static void BFS(int v) {
        // 큐
        Queue<int []> queue = new LinkedList<>();
        visited[v] = true;
        queue.offer(new int []{v, 1});

        while (!queue.isEmpty()) {
            int []now = queue.poll();
            sb.append(now[0]).append(" ");

            for(int i: A[now[0]]) {
                if(!visited[i]) {
                    visited[i] = true;
                    queue.offer(new int []{i, now[1] + 1});
                }
            }
        }
    }
}