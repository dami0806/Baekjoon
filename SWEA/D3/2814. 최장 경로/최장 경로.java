import java.util.*;
import java.io.*;

class Solution {
   

    static ArrayList<Integer> A[];
    static boolean visited[];
    static int max;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            A = new ArrayList[N + 1];
            visited = new boolean[N + 1];

            for(int i = 1; i<=N ; i++) {
            	A[i] = new ArrayList<>();
            }
            
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                A[a].add(b);
                A[b].add(a);
            }
            max = 0;
            for (int i = 1; i <= N; i++) {
                visited = new boolean[N+1];
                    dfs(i, 1);
            }
            System.out.println("#"+test_case+ " " + max);
        }
    }

    static void dfs(int node, int depth) {
        if (visited[node]) return;

        visited[node] = true;
        max = Math.max(max, depth);

        for (int next : A[node]) {
            if (!visited[next]) {
                dfs(next, depth + 1);
            }
        }
          visited[node] = false;
    }
}
