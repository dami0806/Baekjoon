import java.util.*;
import java.io.*;

public class Main {
    static int[] selected;
    static boolean[] visited;
    static int[] arr;
    static int N =1;
    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            if(N == 0) {
                break;
            }
            selected = new int[6];
            arr = new int[N];

            for(int i = 0 ; i < N; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            dfs(0,0);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    static void dfs(int depth, int start) {
        if(depth == 6) {
            for(int i = 0 ; i <6; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = start; i<N; i++) {
            selected[depth] = arr[i];
            dfs(depth+1, i+1);
        }
    }
}