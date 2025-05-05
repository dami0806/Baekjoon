import java.util.*;
import java.io.*;

public class Main {
    static int[] seleted;
    static int M ;
    static int num;
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 4 2
        StringTokenizer st = new StringTokenizer(br.readLine());

        num = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        seleted = new int[M];
        bfs(0,1);
    }
    static void bfs(int depth, int start){
        if(depth == M) {
            for(int i = 0 ; i < M; i ++){
                System.out.print(seleted[i]+ " ");
            }
            System.out.println();
            return;
        }
        for(int i = start; i<=num; i++){
            seleted[depth] = i;
            bfs(depth+1, i+1);
        }
    }
}