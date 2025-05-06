import java.util.*;
import java.io.*;

public class Main {
    static int[] selected;
    static HashSet<String> set = new HashSet<>();
    static boolean[] visited;
    static int[] arr;
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        selected = new int[M];
        visited = new boolean[N];
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(0,0);
        System.out.println(sb.toString());
    }
    static void dfs(int depth, int start) {
        StringBuilder temp= new StringBuilder();

        if(depth == M) {
            for(int i = 0 ; i< M ;i ++){
                temp.append(selected[i]).append(" ");
            }
            if(!set.contains(temp.toString())) {
                set.add(temp.toString());
                sb.append(temp).append("\n");
            }
            return;
        }
        for(int i = start; i<N; i++) {
            selected[depth] = arr[i];
            dfs(depth+1, i);
        }
    }
}