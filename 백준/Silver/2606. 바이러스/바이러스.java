import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        graph = new ArrayList[n+1];
        visited = new boolean[n+1];
        for (int i = 0; i < n+1; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }
        dfs(1);

        writer.write(String.valueOf(count-1));
        writer.flush();
        writer.close();
        reader.close();
    }

    public static void dfs(int node) {
        if (visited[node]) {
            return;
        }
        count++;
        visited[node] = true;
        for (int i : graph[node]) {
            dfs(i);
        }
    }
}