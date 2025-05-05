import java.util.*;
import java.io.*;

public class Main {
    static int[] selected;
    static int M ;
    static int N;
    static int arr[];
    static boolean visited[];
    static StringBuilder sb= new StringBuilder();
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 4 2
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        selected = new int[M];
        visited = new boolean[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i< N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
         dfs(0);
        System.out.println(sb.toString());
    }
    static void dfs(int depth){
        // 중복 안되고, 다음 숫자만 가능
        if(depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 0; i < N; i++) {

            if(!visited[i]){
                visited[i] = true;
                selected[depth] = arr[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }

    }
}