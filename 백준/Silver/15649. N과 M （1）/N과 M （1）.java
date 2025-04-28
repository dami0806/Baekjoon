import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int M;
    static boolean visited[];
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 4 2
        M= Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        dfs(0);
    }
    static void dfs(int depth){
        if(depth == M){
            for(int i =0 ;i<depth; i++){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
            return;
        }

        for(int i = 1 ; i<=N ;i++){
            if(!visited[i]) {
                arr.add(i);
                visited[i] = true;
                dfs(depth+1);
                visited[i] = false;
                arr.remove(arr.size()-1);
            }
        }
    }
}