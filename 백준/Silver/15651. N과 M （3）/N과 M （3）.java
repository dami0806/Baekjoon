import java.util.*;
import java.io.*;

public class Main {
    static int[] selected;
    static int M ;
    static int num;
    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 4 2
        StringTokenizer st = new StringTokenizer(br.readLine());

        num = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        selected = new int[M];
        bfs(0);

            System.out.println(sb.toString());

    }
    static void bfs(int depth){
        if(depth == M ) {

            for(int i = 0 ; i < M ; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 1; i <= num; i++){
            selected[depth] = i;

            bfs(depth+1);
        }
    }
}